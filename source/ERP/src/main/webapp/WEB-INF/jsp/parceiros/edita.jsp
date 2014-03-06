<div class="span9" id="content">
	<!-- morris stacked chart -->
	<div class="row-fluid">
		<!-- block -->
		<div class="block">
			<div class="navbar navbar-inner block-header">
				<div class="muted pull-left">Cadastros</div>
			</div>


			<form class="form-horizontal"
				action="<c:url value="/parceiros/${parceiro.id}"/>" method="POST">
				<fieldset>
					<div class="block-content collapse in">
						<div class="span12">

							<legend>Editar Parceiros</legend>


							<div class="control-group">
								<label class="control-label" for="focusedInput">Nome:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="parceiro.nome" value="${parceiro.nome }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Razão
									Social</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="parceiro.razao_social"
										value="${parceiro.razao_social }">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Inscrição
									Estatual</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="parceiro.ie" value="${parceiro.ie }">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">CNPJ</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="parceiro.cnpj" value="${parceiro.cnpj }">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">CPF</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="parceiro.cpf" value="${parceiro.cpf }">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">RG</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="parceiro.rg" value="${parceiro.rg }">
								</div>
							</div>


							<div class="control-group">
								<label class="control-label" for="focusedInput">Telefone:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="parceiro.telefone"
										value="${parceiro.telefone }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Celular:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="parceiro.celular"
										value="${parceiro.celular }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Web
									Site:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="parceiro.web_site"
										value="${parceiro.web_site }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">E-mail:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="parceiro.email" value="${parceiro.email }" />
								</div>
							</div>



							<legend>Endereço</legend>

							<div class="control-group">
								<label class="control-label" for="focusedInput">CEP</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="parceiro.cep" value="${parceiro.cep }">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Logradouro</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="parceiro.logradouro"
										value="${parceiro.logradouro }">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Número</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="parceiro.nro" value="${parceiro.nro }">
								</div>
							</div>


							<div class="control-group">
								<label class="control-label" for="focusedInput">Complemento</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="parceiro.complemento"
										value="${parceiro.complemento }">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Bairro</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="parceiro.bairro" value="${parceiro.bairro }">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Cidade</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="parceiro.cidade" value="${parceiro.cidade }">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">UF</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="parceiro.uf" value="${parceiro.uf }">
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
