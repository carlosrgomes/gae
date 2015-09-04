<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Cadastro Beneficiario</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Cadastro Beneficiario</h2>
  <form class="form-horizontal"   role="form" action="add" method="post">
    <div class="form-group">
      <label class="control-label col-sm-2" for="nome">Nome:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="nome" name="nome" placeholder="Digite seu Nome">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="endereco">Endereço</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="endereco" name="endereco" placeholder="Digite seu  Endereço">
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
  <c:if test="${not empty lista}">
    <table class="table">
    <thead>
      <tr>
        <th>ID</th>
        <th>Nome</th>
        <th>Endereco</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="i" items="${lista}" >
   		<tr>
	        <td><c:out value="${i.id}"/></td>
	        <td><c:out value="${i.nome}"/></td>
	        <td><c:out value="${i.endereco}"/></td>
      </tr>
	</c:forEach>
    
    </tbody>
  </table>
  </c:if>
  
</div>

</body>
</html>
