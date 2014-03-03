<div class="span9" id="content">
	<!-- morris stacked chart -->
	<div class="row-fluid">
		<!-- block -->
		<div class="block">
			<div class="navbar navbar-inner block-header">
				<div class="muted pull-left">Cadastros</div>
			</div>


			<form id ="produtosForm" class="form-horizontal" action="<c:url value="/produtos"/>" method="POST">
				<fieldset>
					<div class="block-content collapse in">
						<div class="span12">

							<div class="alert alert-error">
								<button class="close" data-dismiss="alert">×</button>
								<ul>
									<c:forEach items="${errors}" var="error">
										<li>${error.category } - ${error.message }</li>
									</c:forEach>
								</ul>
							</div>

							<legend>Adicionar Produto</legend>

							<label for="nome">Nome:</label> 
							<input id="nome" minlength ="3" type="text" name="produto.nome" value="${produto.nome }" /> 
							
							<label for="descricao">Descrição:</label>
							<textarea id="descricao" maxlength="40" name="produto.descricao">${produto.descricao }</textarea>

							<label for="preco">Preço:</label> 
							<input id="preco" type="text" min="0" name="produto.preco" value="${produto.preco }" />

							<button class="btn btn-primary" type="submit">Enviar</button>



						</div>
					</div>
				</fieldset>
			</form>

		</div>
	</div>
</div>

<!-- Validando o Form -->
<script type="text/javascript">
  $('#produtosForm').validate();
</script>
