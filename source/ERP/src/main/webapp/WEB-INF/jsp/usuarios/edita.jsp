<div class="span9" id="content">
	<!-- morris stacked chart -->
	<div class="row-fluid">
		<!-- block -->
		<div class="block">
			<div class="navbar navbar-inner block-header">
				<div class="muted pull-left">Cadastros</div>
			</div>
			<form class="form-horizontal" action="<c:url value="/usuarios/${usuario.id}"/>" method="POST">
				<fieldset>
					<legend>Editar Usuário</legend>

					<div class="block-content collapse in">
						<div class="span12">
							<label for="nome">Nome:</label> <input id="nome" type="text" name="usuario.nome" value="${usuario.nome}" /> 
							<label for="login">Login:</label> <input id="login" type="text" name="usuario.login" value="${usuario.login}" />
							<label for="nome">Senha:</label> <input id="senha" type="password" name="usuario.senha" value="${usuario.senha}" /> 
							<button class="btn btn-primary" type="submit" name="_method" value="PUT">Enviar</button>
						</div>
					</div>
				</fieldset>
			</form>
		</div>
	</div>
</div>
