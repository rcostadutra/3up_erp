<div class="span9" id="content">
	<!-- morris stacked chart -->
	<div class="row-fluid">
		<!-- block -->
		<div class="block">
			<div class="navbar navbar-inner block-header">
				<div class="muted pull-left">Cadastros</div>
			</div>


			<form class="form-horizontal"
				action="<c:url value="/transportadoras/${transportadora.id}"/>" method="POST">
				<fieldset>
					<div class="block-content collapse in">
						<div class="span12">

							<legend>Editar Clientes</legend>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Nome:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput" type="text" name="transportadora.nome" value="${transportadora.nome }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Telefone:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput" type="text" name="transportadora.telefone" value="${transportadora.telefone }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Celular:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput" type="text" name="transportadora.celular" value="${transportadora.celular }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Web Site:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput" type="text" name="transportadora.web_site" value="${transportadora.web_site }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">E-mail:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput" type="text" name="transportadora.email" value="${transportadora.email }" />
								</div>
							</div>

							<div class="block-content collapse in">
								<div class="span12">
									<div id="rootwizard">
										<div class="navbar">
											<div class="navbar-inner">
												<div class="container">
													<ul>
														<li><a href="#tab1" data-toggle="tab">Endereços</a></li>
														<li><a href="#tab3" data-toggle="tab">Pessoa Juridica</a></li>
													</ul>
												</div>
											</div>
										</div>
										<div id="bar" class="progress progress-striped active dn">
											<div class="bar"></div>
										</div>
										<div class="tab-content">

											<div class="tab-pane" id="tab1">

												<legend>Endereço</legend>

												<div class="control-group">
													<label class="control-label" for="focusedInput">CEP</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput" type="text" name="transportadora.cep" value="${transportadora.cep }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Logradouro</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput" type="text" name="transportadora.logradouro" value="${transportadora.logradouro }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Número</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput" type="text" name="transportadora.nro" value="${transportadora.nro }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Número</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput" type="text" name="transportadora.nro" value="${transportadora.nro }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Complemento</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput" type="text" name="transportadora.complemento" value="${transportadora.complemento }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Bairro</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput" type="text" name="transportadora.bairro" value="${transportadora.bairro }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Cidade</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput" type="text" name="transportadora.cidade" value="${transportadora.cidade }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">UF</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput" type="text" name="transportadora.uf" value="${transportadora.uf }">
													</div>
												</div>
											</div>

											<div class="tab-pane" id="tab3">

												<div class="control-group">
													<label class="control-label" for="focusedInput">Razão Social</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput" type="text" name="transportadora.razao_social" value="${transportadora.razao_social }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Inscrição Estatual</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput" type="text" name="transportadora.ie" value="${transportadora.ie }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">CNPJ</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput" type="text" name="transportadora.cnpj" value="${transportadora.cnpj }">
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>

							<div class="form-actions">
								<button class="btn btn-primary" type="submit" name="_method" value="PUT">Enviar</button>
								<button class="btn" Type="button" VALUE="Back" onClick="history.go(-1);return true;">Cancelar</button>
							</div>
						</div>
					</div>
				</fieldset>
			</form>

		</div>
	</div>
</div>