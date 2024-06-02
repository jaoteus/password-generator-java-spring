// src/App.js
import React from 'react';
import PasswordGenerator from './components/PasswordGenerator';
import './App.css';

function App() {
  return (
    <div className="App">
      <h1>Gerador de Senhas Fortes</h1>
      <PasswordGenerator />
    </div>
  );
}

export default App;
