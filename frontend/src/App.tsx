import React from 'react';
import './App.css';
import StandingsTable from './components/StandingsTable';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1>Soccer Standings Hub</h1>
      </header>
      <main>
        <StandingsTable />
      </main>
    </div>
  );
}

export default App;
