package br.univel;

import br.univel.Coluna;
import br.univel.Tabela;

	public class Cliente {

		@Coluna(pk=true, nome="CADID")
		private int id;

		@Coluna(nome="CADNOME")
		private String nome;

		public Cliente() {
			this(0, null);
		}

		public Cliente(int id, String nome) {
			super();
			this.id = id;
			this.nome = nome;
		}


		public void dizerOla() {
			System.out.println("Olá!");
		}

		public String retornarOla(String nome) {
			return "Olá " + nome + "!";
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

	}


