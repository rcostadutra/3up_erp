<div class="span9" id="content">
	<!-- morris stacked chart -->
	<div class="row-fluid">
		<!-- block -->
		<div class="block">
			<div class="navbar navbar-inner block-header">
				<div class="muted pull-left">Cadastros</div>
			</div>

			<form class="form-horizontal" action="<c:url value="/produtos"/>" method="POST">
				<fieldset>
					<div class="block-content collapse in">
						<div class="span12">
							<legend>Adicionar Produto</legend>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Nome:</label>
								<div class="controls">
									<input class="input-xlarge" id=" nome" minlength="3" type="text" name="produto.nome" value="${produto.nome }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Cod. Barra:</label>
								<div class="controls">
									<input class="input-xlarge" id="cod_barra" minlength="3" type="text" name="produto.cod_barra" value="${produto.cod_barra }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="descricao">Descrição:</label>
								<div class="controls">
									<textarea class="input-xlarge" id="descricao" maxlength="40" name="produto.descricao">${produto.descricao }</textarea>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="preco">Preço:</label>
								<div class="controls">
									<input class="input-xlarge" id="preco" type="text" min="0" name="produto.preco" value="${produto.preco }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="custo">Custo:</label>
								<div class="controls">
									<input class="input-xlarge" id="custo" type="text" min="0" name="produto.custo" value="${produto.custo }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="custo_medio">Custo Medio:</label>
								<div class="controls">
									<input class="input-xlarge" id="custo_medio" type="text" min="0" name="produto.custo_medio" value="${produto.custo_medio }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="preco_venda">Preço Venda:</label>
								<div class="controls">
									<input class="input-xlarge" id="preco_venda" type="text" min="0" name="produto.preco_venda" value="${produto.preco_venda }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="margem_lucro">Margem
									de Lucro:</label>
								<div class="controls">
									<input class="input-xlarge" id="margem_lucro" type="text" min="0" name="produto.margem_lucro" value="${produto.margem_lucro }" />
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