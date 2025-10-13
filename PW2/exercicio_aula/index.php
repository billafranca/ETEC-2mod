<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exercício PHP</title>
    <link rel="stylesheet" href="index.css">
</head>
<body>
    <img id="title" src="etec-image.png">
    
    <section id="form">
        <form id="formulario" method="POST" action="index.php">
            <input type="text" name="nome" placeholder="Digite seu nome" required>
            <input type="text" name="rm" placeholder="Digite seu RM" required>
            <input type="password" name="senha" placeholder="Digite sua senha" required>
            <button type="submit">Enviar</button>
        </form>
    </section>

    <?php
    ini_set('display_errors', 1);
    error_reporting(E_ALL);

    
    $nome = $_POST['nome'] ?? '';
    $rm = $_POST['rm'] ?? '';
    $senhaForm = $_POST['senha'] ?? '';

    if (!empty($nome) && !empty($rm) && !empty($senhaForm)) {

        
        $host = 'localhost';
        $username = 'root';
        $senhaDB = ''; 
        $dbnome = 'aulaphp';

        
        $con = new mysqli($host, $username, $senhaDB, $dbnome);

        if ($con->connect_error) {
            die("Erro de conexão: " . $con->connect_error);
        }

        
        $SELECT_QUERY = "SELECT nome FROM alunos WHERE nome = ?";
        $INSERT_QUERY = "INSERT INTO alunos (nome, rm, senha) VALUES (?, ?, ?)";
        

        $stmt_select = $con->prepare($SELECT_QUERY);
        if (!$stmt_select) {
            die("Erro ao preparar SELECT: " . $con->error);
        }

        $stmt_select->bind_param("s", $nome);
        $stmt_select->execute();
        $stmt_select->store_result();

        if ($stmt_select->num_rows == 0) {
            $stmt_select->close();

            $stmt_insert = $con->prepare($INSERT_QUERY);
            if (!$stmt_insert) {
                die("Erro ao preparar INSERT: " . $con->error);
            }
            

            $stmt_insert->bind_param("sss", $nome, $rm, $senhaForm);
            $stmt_insert->execute();
            $senhaHash = password_hash($senhaForm, PASSWORD_DEFAULT);
            echo "<center><p style='color: green;'>Cadastro realizado com sucesso!</p></center>";
            $stmt_insert->close();
        } else {
            echo "<center><p style='color: red;'>Erro: '$nome' já está registrado!</p></center>";
            $stmt_select->close();
        }

        $con->close();
    } else {
        echo "<center><p style='color: red;'>Por favor, preencha todos os campos.</p></center>";
    }
    ?>
</body>
</html>
