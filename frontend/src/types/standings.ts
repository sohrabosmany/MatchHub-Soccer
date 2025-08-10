export interface TeamInfo {
  name: string;
  shortName: string;
  tla: string;
  crest: string;
}

export interface TeamStanding {
  position: number;
  team: TeamInfo;
  playedGames: number;
  form: string;
  won: number;
  draw: number;
  lost: number;
  points: number;
  goalsFor: number;
  goalsAgainst: number;
  goalDifference: number;
}