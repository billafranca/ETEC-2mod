document.addEventListener("DOMContentLoaded", function() {
    let nome = document.getElementById('nomeUser');
    let senha = document.getElementById('senhaUser');
    let cpf = document.getElementById('cpfUser');
    let email = document.getElementById('emailUser');
    const btn = document.getElementById('botao');

    btn.addEventListener("click", function() {
        if (!nome.value) {
            alert("Por favor, preencha seu nome.");
            nome.focus();
            return;
        }

        if (!senha.value || senha.value.length < 6) {
            alert("A senha deve ter pelo menos 6 caracteres.");
            senha.focus();
            return;
        }

        if (!cpf.value || !/^\d{11}$/.test(cpf.value)) {
            alert("Por favor, insira um CPF válido (11 dígitos).");
            cpf.focus();
            return;
        }

        if (!email.value || !/^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/.test(email.value)) {
            alert("Por favor, insira um e-mail válido.");
            email.focus();
            return;
        }
        console.log("Cadastro validado com sucesso!");
        alert("Cadastro feito com sucesso! Redirecionando...");
        window.location.href = "cadastro_2.html";
    });
});
