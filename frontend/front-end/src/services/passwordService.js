// src/services/passwordService.js
export const generatePassword = async (length) => {
    const response = await fetch(`http://localhost:8080/generate/${length}`);
    if (!response.ok) {
      throw new Error('Erro ao gerar a senha');
    }
    const data = await response.json();
    return data.passwordGenerated;
  };
  