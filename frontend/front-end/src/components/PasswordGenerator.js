// src/components/PasswordGenerator.js
import React, { useState } from 'react';
import { generatePassword } from '../services/passwordService';
import './PasswordGenerator.css';

const PasswordGenerator = () => {
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');
  const [length, setLength] = useState(26);  // Valor inicial ajustado para 26 caracteres

  const handleGeneratePassword = async () => {
    if (length < 26) {
      setError('Este algoritmo não permite gerar senhas menores que 26 dígitos');
      setPassword('');
      return;
    }

    try {
      const generatedPassword = await generatePassword(length);
      setPassword(generatedPassword);
      setError('');
    } catch (err) {
      setPassword('');
      setError('Erro ao gerar a senha');
    }
  };

  return (
    <div className="password-generator">
      <input 
        type="number" 
        value={length} 
        onChange={(e) => setLength(e.target.value)} 
        min="1"
        max="128"
        className="length-input"
        placeholder="Comprimento da senha"
      />
      <button onClick={handleGeneratePassword}>Gerar</button>
      {password && <div className="password"> <span className="password-header">Senha Gerada:</span> {password}</div>}
      {error && <div className="error">{error}</div>}
    </div>
  );
};

export default PasswordGenerator;
