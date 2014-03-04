
<div class="span9" id="content">
	<!-- morris stacked chart -->
	<div class="row-fluid">
		<!-- block -->
		<div class="block">
			<div class="navbar navbar-inner block-header">
				<div class="muted pull-left">Cadastros</div>
			</div>

			<form class="form-horizontal" action="<c:url value="/produtos"/>"
				method="POST">
				<fieldset>
					<div class="block-content collapse in">
						<div class="span12">


							<legend>Adicionar Produto</legend>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Nome:</label>
								<div class="controls">
									<input class="input-xlarge" id=" nome" minlength="3"
										type="text" name="produto.nome" value="${produto.nome }" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="descricao">Descrição:</label>
								<div class="controls">
									<textarea class="input-xlarge" id="descricao" maxlength="40"
										name="produto.descricao">${produto.descricao }</textarea>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="preco">Preço:</label>
								<div class="controls">
									<input class="input-xlarge" id="preco" type="text" min="0"
										name="produto.preco" value="${produto.preco }" />
								</div>
							</div>
							<div class="form-actions">
								<button class="btn btn-primary" type="submit">Enviar</button>
								<button class="btn" onclick="window.location.href='/produtos/'">Cancelar</button>
																
							</div>
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