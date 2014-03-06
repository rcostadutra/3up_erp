<div class="span9" id="content">
	<!-- morris stacked chart -->
	<div class="row-fluid">
		<!-- block -->
		<div class="block">
			<div class="navbar navbar-inner block-header">
				<div class="muted pull-left">Cadastros</div>
			</div>


			<form class="form-horizontal"
				action="<c:url value="/fornecedores/${fornecedor.id}"/>" method="POST">
				<fieldset>
					<div class="block-content collapse in">
						<div class="span12">

							<legend>Editar Fornecedor</legend>

<div class="control-group">
								<label class="control-label" for="focusedInput">Nome:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="fornecedor.nome" value="${fornecedor.nome }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Razão
									Social</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="fornecedor.razao_social"
										value="${fornecedor.razao_social }">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Inscrição
									Estatual</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="fornecedor.ie" value="${fornecedor.ie }">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">CNPJ</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="fornecedor.cnpj" value="${fornecedor.cnpj }">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">CPF</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="fornecedor.cpf" value="${fornecedor.cpf }">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">RG</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="fornecedor.rg" value="${fornecedor.rg }">
								</div>
							</div>


							<div class="control-group">
								<label class="control-label" for="focusedInput">Telefone:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="fornecedor.telefone"
										value="${fornecedor.telefone }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Celular:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="fornecedor.celular"
										value="${fornecedor.celular }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Web
									Site:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="fornecedor.web_site"
										value="${fornecedor.web_site }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">E-mail:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="fornecedor.email" value="${fornecedor.email }" />
								</div>
							</div>



							<legend>Endereço</legend>

							<div class="control-group">
								<label class="control-label" for="focusedInput">CEP</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="fornecedor.cep" value="${fornecedor.cep }">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Logradouro</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="fornecedor.logradouro"
										value="${fornecedor.logradouro }">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Número</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="fornecedor.nro" value="${fornecedor.nro }">
								</div>
							</div>


							<div class="control-group">
								<label class="control-label" for="focusedInput">Complemento</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="fornecedor.complemento"
										value="${fornecedor.complemento }">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Bairro</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="fornecedor.bairro" value="${fornecedor.bairro }">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Cidade</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="fornecedor.cidade" value="${fornecedor.cidade }">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">UF</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="fornecedor.uf" value="${fornecedor.uf }">
								</div>
							</div>

					
							<div class="form-actions">
								<button class="btn btn-primary" type="submit" name="_method"
									value="PUT">Enviar</button>

								<button class="btn" Type="button" VALUE="Back"
									onClick="history.go(-1);return true;">Cancelar</button>

							</div>

						</div>
					</div>
				</fieldset>
			</form>

		</div>
	</div>
</div>
