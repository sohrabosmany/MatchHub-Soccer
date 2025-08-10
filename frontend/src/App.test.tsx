import React from 'react';
import { render, screen } from '@testing-library/react';
import App from './App';

test('renders soccer standings hub', () => {
  render(<App />);
  const titleElement = screen.getByText(/Soccer Standings Hub/i);
  expect(titleElement).toBeInTheDocument();
});
