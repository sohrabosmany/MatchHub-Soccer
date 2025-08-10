import React from 'react';

interface SeasonSelectorProps {
  selectedSeason: string;
  onSeasonChange: (season: string) => void;
}

const SeasonSelector: React.FC<SeasonSelectorProps> = ({ 
  selectedSeason, 
  onSeasonChange 
}) => {
  const currentYear = new Date().getFullYear();
  const seasons = [];
  
  // Add current season first
  seasons.push({ year: currentYear, label: `${currentYear}/${String(currentYear + 1).slice(-2)} (Current)`, value: '' });
  
  // Add previous seasons
  for (let year = currentYear - 1; year >= 2018; year--) {
    seasons.push({ year, label: `${year}/${String(year + 1).slice(-2)}`, value: `${year}` });
  }

  return (
    <div className="season-selector">
      <label htmlFor="season-select">Season: </label>
      <select 
        id="season-select"
        value={selectedSeason} 
        onChange={(e) => onSeasonChange(e.target.value)}
        className="season-dropdown"
      >
        {seasons.map(season => (
          <option key={season.year} value={season.value}>
            {season.label}
          </option>
        ))}
      </select>
    </div>
  );
};

export default SeasonSelector;