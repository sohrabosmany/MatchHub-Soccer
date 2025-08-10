import React, { useState, useEffect } from 'react';
import { TeamStanding } from '../types/standings';
import { api } from '../services/api';
import './StandingsTable.css';

const StandingsTable: React.FC = () => {
  const [standings, setStandings] = useState<TeamStanding[]>([]);
  const [loading, setLoading] = useState<boolean>(true);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    const fetchStandings = async () => {
      try {
        setLoading(true);
        const data = await api.getLaLigaStandings();
        setStandings(data);
        setError(null);
      } catch (err) {
        setError('Failed to fetch standings data');
        console.error('Error:', err);
      } finally {
        setLoading(false);
      }
    };

    fetchStandings();
  }, []);

  if (loading) {
    return <div className="loading">Loading La Liga standings...</div>;
  }

  if (error) {
    return <div className="error">{error}</div>;
  }

  return (
    <div className="standings-container">
      <h2>La Liga Standings</h2>
      <table className="standings-table">
        <thead>
          <tr>
            <th>Pos</th>
            <th>Team</th>
            <th>MP</th>
            <th>W</th>
            <th>D</th>
            <th>L</th>
            <th>GF</th>
            <th>GA</th>
            <th>GD</th>
            <th>Pts</th>
          </tr>
        </thead>
        <tbody>
          {standings.map((team) => (
            <tr key={team.position}>
              <td className="position">{team.position}</td>
              <td className="team">
                <div className="team-info">
                  {team.team.crest && (
                    <img 
                      src={team.team.crest} 
                      alt={`${team.team.name} crest`}
                      className="team-crest"
                    />
                  )}
                  <span className="team-name">{team.team.name}</span>
                </div>
              </td>
              <td>{team.playedGames}</td>
              <td>{team.won}</td>
              <td>{team.draw}</td>
              <td>{team.lost}</td>
              <td>{team.goalsFor}</td>
              <td>{team.goalsAgainst}</td>
              <td className={team.goalDifference >= 0 ? 'positive' : 'negative'}>
                {team.goalDifference > 0 ? '+' : ''}{team.goalDifference}
              </td>
              <td className="points">{team.points}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default StandingsTable;