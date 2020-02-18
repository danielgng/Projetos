
package Loja;
import java.util.Date;

public abstract class Pessoa {
        private String cpf, nome, celular;
        private Date dataNascimento;

        public String getCpf() {
        return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCelular() {
            return celular;
        }

        public void setCelular(String celular) {
            this.celular = celular;
        }

        public Date getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(Date dataNascimento) {
            this.dataNascimento = dataNascimento;
        }
        
        
        
        
        
    
        public abstract void cadastrar();
        
        
    
}
