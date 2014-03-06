<div class="span9" id="content">
	<!-- morris stacked chart -->
	<div class="row-fluid">
		<!-- block -->
		<div class="block">
			<div class="navbar navbar-inner block-header">
				<div class="muted pull-left">Cadastros</div>
			</div>


			<form class="form-horizontal"
				action="<c:url value="/clientes/${cliente.id}"/>" method="POST">
				<fieldset>
					<div class="block-content collapse in">
						<div class="span12">

							<legend>Editar Clientes</legend>



							<div class="control-group">
								<label class="control-label" for="focusedInput">Nome:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="cliente.nome" value="${cliente.nome }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Telefone:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="cliente.telefone"
										value="${cliente.telefone }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Celular:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="cliente.celular" value="${cliente.celular }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Web
									Site:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="cliente.web_site"
										value="${cliente.web_site }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">E-mail:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput"
										type="text" name="cliente.email" value="${cliente.email }" />
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
														<li><a href="#tab2" data-toggle="tab">Pessoa
																Fisica</a></li>
														<li><a href="#tab3" data-toggle="tab">Pessoa
																Juridica</a></li>

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
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.cep" value="${cliente.cep }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Logradouro</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.logradouro"
															value="${cliente.logradouro }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Número</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.nro" value="${cliente.nro }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Número</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.nro" value="${cliente.nro }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Complemento</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.complemento"
															value="${cliente.complemento }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Bairro</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.bairro"
															value="${cliente.bairro }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Cidade</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.cidade"
															value="${cliente.cidade }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">UF</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.uf" value="${cliente.uf }">
													</div>
												</div>

												<legend>Endereço Entrega</legend>

												<div class="control-group">
													<label class="control-label" for="focusedInput">CEP</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.cep_entrega"
															value="${cliente.cep_entrega }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Logradouro</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.logradouro_entrega"
															value="${cliente.logradouro_entrega }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Número</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.nro_entrega"
															value="${cliente.nro_entrega }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Número</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.nro_entrega"
															value="${cliente.nro_entrega }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Complemento</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.complemento_entrega"
															value="${cliente.complemento_entrega }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Bairro</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.bairro_entrega"
															value="${cliente.bairro_entrega }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Cidade</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.cidade_entrega"
															value="${cliente.cidade_entrega }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">UF</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.uf_entrega"
															value="${cliente.uf_entrega }">
													</div>
												</div>


											</div>
											<div class="tab-pane" id="tab2">


												<div class="control-group">
													<label class="control-label" for="focusedInput">CPF</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.cpf" value="${cliente.cpf }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">RG</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.rg" value="${cliente.rg }">
													</div>
												</div>



											</div>
											<div class="tab-pane" id="tab3">

												<div class="control-group">
													<label class="control-label" for="focusedInput">Razão
														Social</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.razao_social"
															value="${cliente.razao_social }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">Inscrição
														Estatual</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.ie" value="${cliente.ie }">
													</div>
												</div>

												<div class="control-group">
													<label class="control-label" for="focusedInput">CNPJ</label>
													<div class="controls">
														<input class="input-small focused" id="focusedInput"
															type="text" name="cliente.cnpj" value="${cliente.cnpj }">
													</div>
												</div>
											</div>
										</div>
									</div>
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
