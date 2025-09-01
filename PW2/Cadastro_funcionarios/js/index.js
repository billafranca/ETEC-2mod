document.addEventListener('DOMContentLoaded', () => {
    const formulario = document.getElementById('formulario');
    const nomeInput = document.getElementById('nome');
    const funcaoInput = document.getElementById('funcao');
    const salarioInput = document.getElementById('salario');
    const tabelaCorpo = document.getElementById('tabela-corpo');
    const msgErro = document.getElementById('msgErro');
  
    let lista = JSON.parse(localStorage.getItem('funcionarios')) || [];
    let indexEditando = null;
  
    function limparCampos() {
      nomeInput.value = '';
      funcaoInput.value = '';
      salarioInput.value = '';
      indexEditando = null;
    }
  
    function salvarLista() {
      localStorage.setItem('funcionarios', JSON.stringify(lista));
    }
  
    function renderizarTabela() {
      tabelaCorpo.innerHTML = '';
  
      lista.forEach((item, index) => {
        const tr = document.createElement('tr');
  
        tr.innerHTML = `
          <td>${item.nome}</td>
          <td>${item.funcao}</td>
          <td>R$ ${parseFloat(item.salario).toFixed(2)}</td>
          <td class="acoes">
            <button onclick="editar(${index})">✏️ Editar</button>
            <button onclick="excluir(${index})">🗑️ Excluir</button>
          </td>
        `;
  
        tabelaCorpo.appendChild(tr);
      });
    }
  
    formulario.addEventListener('submit', (e) => {
      e.preventDefault();
      msgErro.textContent = '';
  
      const nome = nomeInput.value.trim();
      const funcao = funcaoInput.value.trim();
      const salario = salarioInput.value.trim();
  
      if (!nome || !funcao || !salario || isNaN(salario) || salario <= 0) {
        msgErro.textContent = 'Preencha todos os campos corretamente.';
        return;
      }
  
      const funcionario = { nome, funcao, salario };
  
      if (indexEditando !== null) {
        lista[indexEditando] = funcionario;
      } else {
        lista.push(funcionario);
      }
  
      salvarLista();
      renderizarTabela();
      limparCampos();
    });
  

    window.editar = function (index) {
      const item = lista[index];
      nomeInput.value = item.nome;
      funcaoInput.value = item.funcao;
      salarioInput.value = item.salario;
      indexEditando = index;
    };
  
    window.excluir = function (index) {
      if (confirm('Deseja realmente excluir este registro?')) {
        lista.splice(index, 1);
        salvarLista();
        renderizarTabela();
      }
    };
  
    
    renderizarTabela();
  });
  