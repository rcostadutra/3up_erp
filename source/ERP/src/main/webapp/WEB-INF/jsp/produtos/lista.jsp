

<div class="span9" id="content">


	<div class="row-fluid">
		<!-- block -->


		<div class="block">
			<div class="navbar navbar-inner block-header">
				<div class="muted pull-left">Pesquisa</div>
				<div class="block-content collapse in">
					<div class="span12">
						<form action="<c:url value="/produtos/busca"/>">
							<input id="busca" name="nome" />
						</form>



						<button class="btn btn-primary"
							onclick="window.location.href='/produtos/novo'">Novo</button>

					</div>
				</div>
			</div>

		</div>


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
								<th>Descri��o</th>
								<th>Pre�o</th>

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

<script type="text/javascript">
	$("#busca").puts("Busca produtos por nome ...");
	
	$("#busca").autocomplete('<c:url value="/produtos/busca.json"/>', {
		dataType : "json", // pra falar que vamos tratar um json
		parse : function(produtos) {
			// para tratar o json
			// a fun��o map vai iterar por toda a lista, 
			// e transformar os dados usando a fun��o passada
			return $.map(produtos, function(produto) {
				return {
					// todos os dados do produto
					data : produto,
					// o valor l�gico do produto
					value : produto.nome,
					// o que vai aparecer ao selecionar
					result : produto.nome
				};
			});
		},
		// o que vai aparecer na lista de autocomplete
		formatItem : function(produto) {
			return produto.nome + "(" + produto.preco + ")";
		}
	});
</script>
