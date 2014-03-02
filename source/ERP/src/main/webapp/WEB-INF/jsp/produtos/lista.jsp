<div class="span9" id="content">

	<div class="row-fluid">
		<!-- block -->

		<button class="btn btn-primary"
			onclick="window.location.href='/produtos/novo'">Novo</button>


		<div class="block">
			<div class="navbar navbar-inner block-header">
				<div class="muted pull-left">Produtos</div>
			</div>


			<div class="block-content collapse in">
				<div class="span12">
					<table cellpadding="0" cellspacing="0" border="0"
						class="table table-striped table-bordered" id="example">
						<thead>
							<tr>
								<th>Nome</th>
								<th>Descrição</th>
								<th>Preço</th>

							</tr>
						</thead>
						<tbody>
							<c:forEach items="${produtoList}" var="produto">
								<tr>
									<td>${produto.nome }</td>
									<td>${produto.descricao }</td>
									<td>${produto.preco }</td>
									<td><a href="<c:url value="/produtos/${produto.id}"/>">Editar</a></td>
									<td>
										<form action="<c:url value="/produtos/${produto.id}"/>"
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

