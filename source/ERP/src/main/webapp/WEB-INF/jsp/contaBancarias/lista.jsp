
<div class="span9" id="content">

	<div class="row-fluid">
		<!-- block -->
		<div class="block">
			<div class="navbar navbar-inner block-header">
				<div class="muted pull-left">Conta Bancária</div>
				<button class="button-grid"
					onclick="window.location.href='/contaBancarias/novo'">Novo</button>
			</div>
			<div class="block-content collapse in">
				<div class="span12">
					<table cellpadding="0" cellspacing="0" border="0"
						class="table table-striped table-bordered" id="example">
						<thead>
							<tr>
								<th>Código</th>
								<th>Mnemonico</th>
								<th>Agência</th>
								<th>Conta</th>
								<th>Gerente</th>
								<th>Tipo Conta</th>
															

								<th>Editar</th>
								<th>Remover</th>

							</tr>
						</thead>
						<tbody class="odd gradeX">
							<c:forEach items="${contaBancariaList}" var="contaBancaria">
								<tr>
									<td>${contaBancaria.id }</td>
									<td>${contaBancaria.mnemonico }</td>
									<td>${contaBancaria.nrAgencia }-${contaBancaria.digitoAgencia }</td>
									<td>${contaBancaria.nrConta }-${contaBancaria.digitoConta }</td>
									<td>${contaBancaria.gerenteConta }</td>
									<td>${contaBancaria.tipoConta }</td>
									<td><a href="<c:url value="/contaBancarias/${contaBancaria.id}"/>">Editar</a></td>
									<td>
										<form action="<c:url value="/contaBancarias/${contaBancaria.id}"/>"
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

