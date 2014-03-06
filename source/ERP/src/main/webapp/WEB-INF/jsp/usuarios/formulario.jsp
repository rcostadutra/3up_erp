<div class="span9" id="content">
	<!-- morris stacked chart -->
	<div class="row-fluid">
		<!-- block -->
		<div class="block">
			<div class="navbar navbar-inner block-header">
				<div class="muted pull-left">Cadastros</div>
			</div>
			<form class="form-horizontal" action="<c:url value="/usuarios"/>" method="POST">
				<fieldset>
					<div class="block-content collapse in">
						<div class="span12">
							<legend>Adicionar Usuário</legend>
							<div class="control-group">
								<label class="control-label" for="focusedInput">Nome:</label>
								<div class="controls">
									<input class="input-xlarge" id="nome" minlength="3" maxlength="100" type="text" name="usuario.nome" value="${usuario.nome}" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="login">Login:</label>
								<div class="controls">
									<input class="input-xlarge" id="Login" minlength="3" maxlength="20" type="text" name="usuario.login" value="${usuario.login}" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="senha">Senha:</label>
								<div class="controls">
									<input class="input-xlarge" id="senha" type="password" maxlength="25" minlength="8" name="usuario.senha" value="${produto.preco }" />
								</div>
							</div>
							<div class="form-actions">
								<button class="btn btn-primary" type="submit">Enviar</button>
								<button class="btn" onclick="window.location.href='/usuarios/'">Cancelar</button>
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
		$('#usuariosForm').validate();
	</script>