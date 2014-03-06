<div class="span9" id="content">
	<div class="row-fluid">
		<!-- block -->
		<div class="block">
			<div class="navbar navbar-inner block-header">
				<div class="muted pull-left">Usuários</div>
				<button class="button-grid" onclick="window.location.href='/usuarios/novo'">Novo</button>
			</div>
			<div class="block-content collapse in">
				<div class="span12">
					<table cellpadding="0" cellspacing="0" border="0"
						class="table table-striped table-bordered" id="example">
						<thead>
							<tr>
								<th>Nome</th>
								<th>Login</th>
								<th>Editar</th>
								<th>Remover</th>
							</tr>
						</thead>
						<tbody class="odd gradeX">
							<c:forEach items="${usuarioList}" var="usuario">
								<tr>
									<td>${usuairo.nome }</td>
									<td>${usuairo.login}</td>
									<td><a href="<c:url value="/produtos/${usuario.id}"/>">Editar</a></td>
									<td>
										<form action="<c:url value="/produtos/${usuario.id}"/>"
											method="POST">
											<button class="link" name="_method" value="DELETE">Remover</button>
										</form>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>