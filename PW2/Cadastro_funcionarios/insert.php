<?php
ini_set('display_errors', 1);
error_reporting(E_ALL);




$nome = $_POST['nome'] ?? '';
$funcao = $_POST['funcao'] ?? '';
$salario = $_POST['salario'] ?? '';

if (!empty($nome) && !empty($funcao) && !empty($salario)) {

    $salario = (float)$salario;

    $host = 'localhost';
    $username = 'root';
    $senha = '';
    $dbnome = 'loja';

    $con = new mysqli($host, $username, $senha, $dbnome);

    if ($con->connect_error) {
        die("Erro de conexão: " . $con->connect_error);
    }

    $SELECT_QUERY = "SELECT nome FROM colaboradores WHERE nome = ?";
    $INSERT_QUERY = "INSERT INTO colaboradores (nome, funcao, salario) VALUES (?, ?, ?)";

    $stmt_select = $con->prepare($SELECT_QUERY);
    if (!$stmt_select) {
        die("Erro ao preparar SELECT: " . $con->error);
    }

    $stmt_select->bind_param("s", $nome);
    $stmt_select->execute();
    $stmt_select->store_result();

    $rnum = $stmt_select->num_rows;

    if ($rnum == 0) {
        $stmt_select->close();

        $stmt_insert = $con->prepare($INSERT_QUERY);
        if (!$stmt_insert) {
            die("Erro ao preparar INSERT: " . $con->error);
        }

        $stmt_insert->bind_param("ssd", $nome, $funcao, $salario);
        $stmt_insert->execute();

        echo "boa men";
        $stmt_insert->close();
    } else {
        echo "erro: '$nome' já está registrado!";
        $stmt_select->close();
    }

    $con->close();
} else {
    echo "Preencha todos os campos!";
}
?>
