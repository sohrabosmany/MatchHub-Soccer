import { TeamStanding } from '../types/standings';

const BASE_URL = 'http://localhost:8080';

export const api = {
  async getLaLigaStandings(season?: string): Promise<TeamStanding[]> {
    try {
      const url = season 
        ? `${BASE_URL}/standings/laliga?season=${season}`
        : `${BASE_URL}/standings/laliga`;
      
      const response = await fetch(url);
      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }
      return await response.json();
    } catch (error) {
      console.error('Error fetching La Liga standings:', error);
      throw error;
    }
  }
};