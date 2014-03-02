<div class="span9" id="content">
	<!-- morris stacked chart -->
	<div class="row-fluid">
		<!-- block -->
		<div class="block">
			<div class="navbar navbar-inner block-header">
				<div class="muted pull-left">Cadastros</div>
			</div>


			<form class="form-horizontal"
				action="<c:url value="/produtos/${produto.id }"/>" method="POST">
				<fieldset>
					<legend>Editar Produto</legend>

					<div class="block-content collapse in">
						<div class="span12">



							<label for="nome">Nome:</label> <input id="nome" type="text"
								name="produto.nome" value="${produto.nome }" /> <label
								for="descricao">Descrição:</label>
							<textarea id="descricao" name="produto.descricao">${produto.descricao }</textarea>

							<label for="preco">Preço:</label> <input id="preco" type="text"
								name="produto.preco" value="${produto.preco }" />

							<button class="btn btn-primary" type="submit" name="_method"
								value="PUT">Enviar</button>
						</div>
					</div>
				</fieldset>
			</form>

		</div>
	</div>
</div>
