<div class="span9" id="content">
	<!-- morris stacked chart -->
	<div class="row-fluid">
		<!-- block -->
		<div class="block">
			<div class="navbar navbar-inner block-header">
				<div class="muted pull-left">Cadastros</div>
			</div>

			<form class="form-horizontal" action="<c:url value="/contaBancarias/${contaBancaria.id}"/>" method="POST">
				<fieldset>
					<div class="block-content collapse in">
						<div class="span12">

							<legend>Editar Conta Bancárica</legend>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Mnemonico:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput" type="text" name="contaBancaria.cliente" value="${contaBancaria.mnemonico }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Agência:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput" type="text" name="contaBancaria.nrAgencia" value="${contaBancaria.nrAgencia }" />
									-
									<input class="input-small focused" id="focusedInput" type="text" name="contaBancaria.digitoAgencia" value="${contaBancaria.digitoAgencia }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Conta:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput" type="text" name="contaBancaria.conta" value="${contaBancaria.nrConta }" />
									-
									<input class="input-small focused" id="focusedInput" type="text" name="contaBancaria.digitoConta" value="${contaBancaria.digitoConta }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Gerente:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput" type="text" name="contaBancaria.gerenteConta" value="${contaBancaria.gerenteConta }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Tipo Conta:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput" type="text" name="contaBancaria.tipoConta" value="${contaBancaria.tipoConta }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Telefone:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput" type="text" name="contaBancaria.telefone" value="${contaBancaria.telefone }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Dias de Protesto:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput" type="text" name="contaBancaria.diasProtesto" value="${contaBancaria.diasProtesto }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Instrução I:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput" type="text" name="contaBancaria.instrucaoI" value="${contaBancaria.instrucaoI }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Instrução II:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput" type="text" name="contaBancaria.instrucaoII" value="${contaBancaria.instrucaoII }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Seq. Remessa:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput" type="text" name="contaBancaria.seqRemessa" value="${contaBancaria.seqRemessa }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Remessa Final:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput" type="text" name="contaBancaria.remessaFinal" value="${contaBancaria.remessaFinal }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Saldo Inicial:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput" type="text" name="contaBancaria.saldoAbertura" value="${contaBancaria.saldoAbertura }" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="focusedInput">Limite Conta:</label>
								<div class="controls">
									<input class="input-small focused" id="focusedInput" type="text" name="contaBancaria.limiteConta" value="${contaBancaria.limiteConta }" />
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