import { TeamStanding } from '../types/standings';

const BASE_URL = 'http://localhost:8080';

export const api = {
  async getLaLigaStandings(): Promise<TeamStanding[]> {
    try {
      const response = await fetch(`${BASE_URL}/standings/laliga`);
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