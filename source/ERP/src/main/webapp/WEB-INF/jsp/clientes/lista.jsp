
<div class="span9" id="content">

	<div class="row-fluid">
		<!-- block -->
		<div class="block">
			<div class="navbar navbar-inner block-header">
				<div class="muted pull-left">Clientes</div>
				<button class="button-grid"
					onclick="window.location.href='/clientes/novo'">Novo</button>
			</div>
			<div class="block-content collapse in">
				<div class="span12">
					<table cellpadding="0" cellspacing="0" border="0"
						class="table table-striped table-bordered" id="example">
						<thead>
							<tr>
								<th>Código</th>
								<th>Nome</th>
								<th>Razao Social</th>
								<th>CPF</th>
								<th>RG</th>
								<th>CNPJ</th>
								<th>IE</th>
								<th>CEP</th>
															

								<th>Editar</th>
								<th>Remover</th>

							</tr>
						</thead>
						<tbody class="odd gradeX">
							<c:forEach items="${clienteList}" var="cliente">
								<tr>
									<td>${cliente.id }</td>
									<td>${cliente.nome }</td>
									<td>${cliente.razao_social }</td>
									<td>${cliente.cpf }</td>
									<td>${cliente.rg }</td>
									<td>${cliente.cnpj }</td>
									<td>${cliente.ie }</td>
									<td>${cliente.cep }</td>
									<td><a href="<c:url value="/clientes/${cliente.id}"/>">Editar</a></td>
									<td>
										<form action="<c:url value="/clientes/${cliente.id}"/>"
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

