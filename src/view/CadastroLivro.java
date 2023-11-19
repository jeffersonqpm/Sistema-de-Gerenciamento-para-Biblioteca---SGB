/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import model.Dao;
import model.Livro;

/**
 *
 * @author Jefferson
 */
public class CadastroLivro extends javax.swing.JFrame {

    /**
     * Creates new form CadastroLivro
     */
    public CadastroLivro() {
        initComponents();
        //txtId.setVisible(false);
        //jLabel6.setVisible(false);
        txtTitulo.requestFocus();

        jcEditora.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Selecionar", "Companhia das Letras", "Editora Rocco", "Darkside",
            "Editora Wish", "Editora Pipoca e Nanquim", "Grupo Editorial Record", "Editora Arqueiro", "Globo"}));

        jcAutor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Selecionar", "Alckmar Luiz dos Santos", "Alcides Villaça", "Alcides B. Garcia", "Albino José Ferreira Coutinho", "Alberto Maduar", "Alberto da Costa e Silva", "Albarus Andreos", "Alana Menk", "Aguinaldo Peres", "Agostinho Minicucci", "Agostina Sasaoka", "Afonso Schmidt", "Afonso Luiz Pereira", "Afonso Henriques de Lima Barreto", "Afonso Arinos", "Affonso Romano de Sant'Anna", "Adriano Siqueira", "Adriano Cardoso", "Adriana Simon", "Adriana Portes", "Adriana Araújo", "Adonias Filho", "Adirson Teles", "Ademir Pascale", "Ademir Assunção", "Adelpho Monjardim", "Adelino dos Santos Abreu", "Adela Figueroa Panisse", "Addam", "Adam Minhoto", "Adalzira Bittencourt", "Adalberto José dos Santos", "Abílio Godoy", "Abelardo Pedroga",
            "Cristiano Konno", "Cristiano de Oliveira Marinho", "Cris Lasaitis", "Corvo", "Constância Lima Duarte", "Conrado Ramazini", "Coelho Neto", "Clóvis Garcia", "Clinton Davisson", "Claudio Villa", "Claudio Parreira", "Cláudio Oliveira Egalon", "Cláudio Moreno", "Claudio Lobato", "Cláudio Figueiredo", "Cláudio Brites", "Claudia Modell", "Claudia Maria Freitas da Silva", "Cláudia Furtado", "Cláudia Curcio", "Clarice Lispector", "Clarice Kowacs", "Clara A. A. Giron", "Cirilo S. Lemos", "Cilaine Alves Cunha", "Cid Vale Ferreira", "Cid Fernandez", "Cícero Leitão", "Cícero de Cesero", "Christian Kirby", "Christian David", "Chris Sevla", "Chico Pascoal", "Chico Buarque", "Chico Anis", "Charles Kiefer", "Charles Dias", "Cezar Alcázar", "César Silva", "César Alcázar", "Celso Santos", "Celso P. Santos", "Celso Leopoldo Pagnan", "Celso Júnior", "Celso Gajo", "Celso Barroso", "Celly Borges", "Celina Portocarrero", "Célia A. N. Passoni", "Cecy Fernandes de Assis", "Cavaleiro de Cervantes - André Luís", "Cássio K.", "Cassandra Rios", "Carolina Mancini", "Carol Chiovatto", "Carmen Seganfredo", "Carlos Silveira Filho", "Carlos Santos", "Carlos Ribeiro", "Carlos Relva", "Carlos Patati", "Carlos Paraná", "Carlos Orsi Martinho", "Carlos Orsi", "Carlos Margarido", "Carlos Henrique Alves", "Carlos Gregório", "Carlos Fred Gz. Morato", "Carlos Faraco", "Carlos Eric", "Carlos Emílio Correia Lima", "Carlos Eduardo Novaes", "Carlos Drummond de Andrade", "Carlos Bornhofen", "Carlos Araújo", "Carlos Angelo", "Carlos André Mores", "Carlos Alberto Ramos", "Carlos Alberto Machado", "Carlos Abreu", "Carlos Abraham Duarte", "Carla Cristina Pereira", "Carla C. Waltrick", "Cardoso", "Capitolina", "Camilo Vannuchi", "Camilo da Anunciação", "Camila Fernandes", "C. M. Poco", "Bruno Schlatter", "Bruno Nunes Ribeiro", "Bruno Mattos", "Bruno Freitas Oliveira", "Bruno Cobbi", "Bruna Dantas Lobato", "Bruna Caroline", "Brontops Baruq", "Brontops", "Braulio Tavares", "Bob Fernandes", "Bertoldo Schneider Jr.", "Bernardo Moraes", "Bernardo Guimarães", "Berilo Neves", "Benigno Salteador", "Beatriz Rinaldi", "Beatriz Berrini", "B. B. Jenitez", "Avery Veríssimo", "Augusto Emílio Zaluar", "Ataíde Tartari", "Assis Brasil", "Assis Arruda", "Artur Vecchi", "Artur Neves", "Artur César Ferreira Reis", "Arthur Dapieve", "Arthur Bonaventura", "Arthur Bastos", "Arlindo Pereira", "Arlete Sobral", "Arlete Nogueira da Cruz", "Arlete Cavaliere", "Arieni Dissenha", "Ariano Suassuna", "Argos Arruda Pinto", "Arcano Soturno", "Aran", "Aparecida de Fátima Bueno", "Antônio Xerxenesky", "Antonio Vicente Seraphim Pietroforte", "Antônio Olinto", "Antônio Nogueira", "Antonio Moreno", "Antonio Luiz M. C. Costa", "António José da Silva", "Antônio Dimas", "Antonio de Jesus", "Antonio Cesar de Oliveira", "Antônio César Chuquer", "Antonio Borgia", "Antonio Balbe", "Antonio Augusto Shaftiel", "Antônio Arnoni Prado", "Anny Lucard", "Annie Piagetti Müller", "Anna Creuza Zacharias", "Anna Creusa", "Anita C. Prado", "Aníbal M. Machado", "Angelo Miranda", "Angel", "Andréa Fátima dos Santos", "Andrea del Fuego", "Andrea Carvalho", "André Vianco", "André Valente", "André Telles", "André Soares Silva", "André Simões", "André Sanches", "André S. Silva", "André Ricardo Aguiar", "André Luís Soares", "André L. Pavesi", "André Kenji", "André Carneiro", "André Bozzetto Jr.", "Anderson Siqueira", "Anderson Santos", "Anatole Ramos", "Ana Paula Pacheco", "Ana Luiza da Silva Garcia", "Ana Lúcia Merege", "Ana Letícia de Fiori", "Ana Cristina Rodrigues", "Ana Claudia Giassone", "Ana Chamorro", "Ana Carolina Silveira", "Ana Carolina Bomfim Jacó", "Ana Beatriz Cabral", "Amílcar Quintella Jr.", "Amaral", "Amândio Sobral", "Amanda Hoelzel", "Alysson F. Ferrari", "Alyne Botelho", "Alvaro Pereira", "Álvaro Malheiros", "Alvaro Luis", "Álvaro Domingues", "Álvares de Azevedo", "Aluísio Azevedo", "Almir Pascale", "Almir Correia", "Almeida Fischer", "Alma Kazur", "Alliah", "Alina Galante", "Alícia Azevedo", "Alfredo Sirkis", "Alfredo Keppler", "Alfredo Gomes", "Alexis Lemos", "Alexei Bueno", "Alexandre Soares", "Alexandre Raposo", "Alexandre Pereira dos Santos", "Alexandre Nicoletti Camargo", "Alexandre Matheus Bliska", "Alexandre Mandarino", "Alexandre Lobão", "Alexandre Heredia", "Alexandre de Souza", "Alexandre Costa", "Alexandre Coslei", "Alexandre Benevides Cabral", "Alexandre Beluco", "Alexander Lancaster", "Alex Antunes", "Alessandro Reiffer", "Alessandro Garcia", "Alecsander Machado",
            "Isolina Bresolin Vianna", "Isaias Edson Sidney", "Isabella Sturzeneker Lemgruber", "Isabel Cristina Van Hien", "Isaac Moraes",
            "Inglês de Souza", "Igor Rosa Dias de Jesus", "Ignácio de Loyola Brandão", "Ícaro França", "Iba Mendes", "Humberto Werneck",
            "Humberto Plínio Ribeiro Filho", "Humberto Fimiani", "Humberto de Campos", "Hugo Vera", "Hugo Pedro Carradore", "Homero Gomes",
            "Hilton James Kutscka", "Hildon Rocha", "Hidemberg Alves da Frota", "Heyder de Siqueira Gomes", "Herberto Sales", "Herbert Eustáquio de Carvalho",
            "Herbert Daniel", "Heraldo Assis Barber", "Henry Evaristo", "Henry Alfred Bugalho", "Henrique J. B.", "Henrique Flory", "Heloísa Seixas",
            "Hélio Guimarães", "Hélio Gomes", "Hélio de Seixas Guimarães", "Helena Gomes", "Helando Marques de Souza", "Heidi Gisele Borges", "Hector Lima",
            "Haroldo de Campos", "Hanna Liis-Baxter", "H. V. Flory", "Gustavo Lopes", "Gustavo Faraon", "Gustavo Brauner", "Gustavo Aquino dos Reis",
            "Gumercindo Rocha Dorea", "Guilherme Solari", "Guilherme Smee", "Guilherme Kujawski", "Guilherme Figueiredo", "Guilherme da Silva Braga",
            "Guido Wilmar Sassi", "Greta Benitez", "Grégor Marcondes", "Graciliano Ramos", "Gonzaga Duque", "Gomes Netto", "Godofredo E. Barnsley",
            "Glauco Mattoso", "Gláucio Santos dos Reis", "Giulia Pierro", "Giulia Moon", "Giselle Natsu Sato", "Gisele Oliveira", "Gisele G. Garcia",
            "Gilberto Schoereder", "Gilberto Garcia da Silva", "Gian Danton", "Ghad Arddhu", "Gerson Lodi-Ribeiro", "Germano do Carmo", "Geraldo Lima",
            "Geraldo Galvão Ferraz", "Gerald C. Izaguirre", "Georgiana Calimeris", "Georgette Silen", "Gastão Cruls", "Garcia de Paiva", "Galpi",
            "Galdino Fernandes Pinheiro", "Gadiego Silvestrini", "Gabriel Torres", "Gabriel Réquiem", "Gabriel Coelho", "Gabriel Cantareira",
            "Gabriel Bozano", "Gabriel Boz", "G. Carmo", "Fúlvio Fonseca", "Frodo Oliveira", "Fritz Peter Bendinelli", "Frederico Cabral",
            "Frederico Branco", "Francisco Marques", "Francisco de Assis Barbosa", "Franklin Cascaes", "Floro Freitas de Andrade",
            "Flávio Paranhos", "Flávio Moutinho", "Flávio Moreira da Costa", "Flávio Medeiros", "Flávio J. Cardozo", "Flávio de Souza",
            "Flávio Carneiro", "Flávia Muniz", "Flávia Côrtes", "Flávia Casarejos", "Finisia Fideli", "Ferreira de Albuquerque",
            "Fernando Trevisan", "Fernando Santos de Oliveira", "Fernando Rezende", "Fernando Moretti", "Fernando Messina", "Fernando Mantelli",
            "Fernando Ferric", "Fernando David", "Fernando Correia da Silva", "Fernando Carneiro", "Fernando C. de Araújo Gomes",
            "Fernando Bonassi", "Fernandes & Fernandes", "Fernanda Salla", "Fernanda Furquim", "Fernanda Bohm", "Felipe Kramer",
            "Felipe Castilho", "Felipe Augusto Geraldo", "Fausto Fawcett", "Fausto Cunha", "Fabíola Colares", "Fábio Rezende",
            "Fábio Madrigal Barreto", "Fabio Luiz Haag", "Fábio Fernandes", "Fábio Fabrício Fabretti", "Fábio Aresi", "Fabi Deschamps",
            "F. P. Andrade", "F. Medina", "Euro Oscar C. Nogueira", "Eunice Vartan Nurin", "Eugênio Gomes", "Estevão Ribeiro",
            "Estêvão Luís Bertoni e Silva", "Estevan Lutz", "Ernesto Nakamura", "Ernâni Fornári", "Érico Veríssimo", "Érico Borgo",
            "Erick Santos Cardoso", "Eric Novello", "Eric M. Souza", "Epaminondas Martins", "Enéas Lintz", "Emir Ross", "Emir Ribeiro",
            "Emílio Satoshi Hamaya", "Emília Freitas", "Elson Gomes Alves", "Elsen Pontual", "Elisa Celino", "Elio Antonio Bonavigo",
            "Elias Manjoulento Neto", "Eleazar", "Elara Reis Sanderssonn", "Êferos Masopias", "Edweine Loureiro", "Edward Gapfinder",
            "Eduardo Torres", "Eduardo Spohr", "Eduardo Kasse", "Eduardo Francisco Torres Ferreira", "Eduardo Borsatto", "Edson Bini",
            "Edson Arantes", "Edmundo Donato", "Edla van Steen", "Edison Luis Raffi Silveira", "Edilberto Coutinho", "Edgard Powell",
            "Edgard Guimarães", "Edgard Cavalheiro", "Edgar Smaniotto", "Edgar Franco", "Edgar Cézar Nolasco", "Éder Scarrot", "Eddie Van Feu",
            "Eddie Nunes", "E. R. Correa", "Duílio Gomes", "Duda Falcão", "Douglas Tufano", "Douglas Quinta Reis", "Douglas MCT", "Douglas Eralldo",
            "Dóris Fleury", "Donizete Galvão", "Domingos Pellegrini", "Domingos Carvalho da Silva", "Domenium", "Diva Bernardes Sepulveda",
            "Dirceu Borges", "Dione Mara Souto da Rosa", "Dino J. Braga", "Dinah Silveira de Queiroz", "Diego Protta Casati", "Diego Possamai",
            "Deuszânia G. Almeida", "DEUS NOiTE", "Deonísio da Silva", "Deoclécio Albuquerque Brito", "Denyse Cantuária", "Dennis Vinicius",
            "Denise Reis", "Denise Crispun", "Denis da Cruz", "Denílson E. Ricci", "Denílson Carareto", "Délio Freire", "Delfin", "Deise J. T. de Freitas",
            "Decio One", "Débora Ramires", "Débora Moraes", "Davi Melo", "Davi M. Gonzales", "Davi Arrigucci Jr.", "Daniel Tréz", "Daniel Portes",
            "Daniel Pereira dos Santos", "Daniel Munduruku", "Daniel I. Dutra", "Daniel HDR", "Daniel Gomes", "Daniel Fresnot", "Daniel Folador",
            "Daniel Borba", "Daniel Alvarez", "Dana Guedes", "Dalma Nascimento", "Cristovam Buarque", "Cristina Vergnano", "Cristina Rodriguez",
            "Cristina Lasaitis", "Cristina Faga", "Zora Seljan", "Zenon", "Zé Wellington", "Yvis Tomazini", "Yuri Vieira", "Yêda Schmaltz",
            "Xico Sá", "Wolmyr Alcantara", "Wilton Pacheco", "Wilson Vieira", "Wilson Bueno", "Willian Oliveira", "William Goldoni",
            "William Agel de Mello", "Welington Almeida Pinto", "Warta Nurin", "Walter Paulo Vieira", "Walter Martins", "Walter Costa",
            "Walnice Nogueira Galvão", "Walmir Ayala", "Walmes Nogueira Galvão", "W. Bariani Ortencio", "Volmar Camargo Junior",
            "Viviane Scholtz", "Vitor Hugo Brandini Ribeiro", "Vítor Basílio", "Vitor Alexandre Chnee", "Viriato Correa", "Vincente Sodak",
            "Victor Snaga", "Victor Poe Lovecraft", "Victor Maduro", "Victor Bertazzo", "Victor Berigo", "Verônica Maria de Araújo Pontes",
            "Verônica Freitas", "Vero de Lima", "Veiga Miranda", "Vasco Ribeiro da Costa", "Valéria Hadel", "Valdomiro Silveira", "Valdo Omirax",
            "Valdeci Lopes", "V. Netto", "Ullians Furloni", "Ubiratan Peleteiro", "Túlio Siqueira", "Trabanom", "Tibor Moricz", "Tiago Toy",
            "Tiago Eloy Zaidan", "Tiago Araújo", "Thomaz Lopes", "Thomaz Albornoz", "Thomas Fairchild", "Thiago Lobo", "Thiago Cabello",
            "Terezinha Monteiro Deutsch", "Tereza Ariel", "Teresa Cabanãs", "Teotonio Simões", "Telê Santana", "Tatiana Alves", "Tânia Souza",
            "Tânia Rebelo Costa Serra", "Tânia Nakamura", "Tânia Franco Carvalhal", "Tadeu Pereira", "Sylvio Gonçalves", "Sybylla °°",
            "Suzy M. Hekamiah", "Susete Mendes", "Susana Lorena de Souza", "Susana Lorena", "Sumaya Sarran", "Sueli Tsumori", "Suelen Marinho",
            "Stephan McSucker", "Som", "Solone de Arruda", "Solange Castanheira", "Soares de Faria", "Simone Saueressig", "Simone O. Marques",
            "Simone Caputo Gomes", "Silvio Roberto Mello Moraes", "Sílvio Ribas", "Sílvio Pilau", "Silvio Alexandre", "Silvia Vieira Fragoso",
            "Silvia Randazzo", "Sílvia Helena Penhalbel", "Silveira Júnior", "Silvana Guimarães", "Silas Corrêa Leite", "Sidemar V. de Castro",
            "Sid Castro", "Shirley Souza", "Shaftiel", "Sergio Sparsbrod", "Sergio Napp", "Sergio Fonseca de Castro", "Sérgio Fiúza",
            "Sérgio Bernardo", "Senbur T. Enovacs", "Sebastião Moreira Duarte", "Santiago Santos", "Santiago Nazarian", "Sandro Quintana",
            "Sandra Nunes", "Sandra Franzoso", "Samuel Peregrino", "Samir S. Souza", "Samir Machado de Machado", "Saint-Clair Stockler",
            "Sabá Gervásio", "Ruy Tapioca", "Ruy Jungmann", "Ruth dos Anjos", "Ruth de Biasi", "Rudyard Leão", "Rudá Almeida",
            "Ruby Felisbino Medeiros", "Rúbia Cunha", "Rubens Teixeira Scavone", "Rubens Figueiredo", "Rubens Austro", "Rubenildo P. de Barros",
            "Rossana Santos", "Rosita Silveirinha Paneiro Corrêa", "Rose Santos", "Rosane Gava", "Rosana Rios", "Rosa Sílvia López",
            "Rosa Amanda Strausz", "Ronyglay Carvalho Fonseca", "Ronnie Wells", "Ronaldo Sergio de Biasi", "Ronaldo Sémper Fidelis",
            "Ronaldo Rogério de Freitas Mourão", "Ronaldo Mourão", "Ronaldo Fernandes", "Ronaldo Carlos", "Ronaldo Bressane", "Romeu Martins",
            "Rogers Silva", "Rogério Silvério de Farias", "Rogerio Saladino", "Rogério Paulo Vieira", "Rogério P. Vieira",
            "Rogério Amaral de Vasconcellos", "Roger Techima", "Roger Jones", "Rodrigo van Kampen", "Rodrigo Silva", "Rodrigo Schwarz",
            "Rodrigo Salvador", "Rodrigo Rosf", "Rodrigo Prata", "Rodrigo Novaes de Almeida", "Rodrigo Moreno", "Rodrigo Garrit",
            "Rodrigo Alfonso Figueira", "Rodolfo Teófilo", "Rodolfo Rorato Londero", "Roderico Reis", "Roberval Barcellos",
            "Roberto Schmitt-Prym", "Roberto Schima", "Roberto Protti", "Roberto Melfra", "Roberto Gambini", "Roberto de Sousa Causo",
            "Roberto César Nascimento", "Roberto Brandão", "Roberto Alves", "Roberta Spindler", "Roberta Nunes", "Roberta Larini",
            "Roberley Antonio", "Roberlandio A. Pinheiro", "Rober Pinheiro", "Rioky Inoue", "Rinaldo de Fernandes", "Richard Diegues",
            "Ricardo Teixeira", "Ricardo Jorge Teixeira Martins", "Ricardo E. Caceffo", "Ricardo Delfin", "Ricardo Christe", "Ribeiro Couto",
            "Renê Belmonte", "Renato Rosatti", "Renato Pereira de Souza", "Renato Arfelli", "Renato A. Azevedo", "Renata Ramirez", "Renata Corte",
            "Renata Cantanhede", "Renard Perez", "Renan da Paula Santos", "Renan Barcellos", "Régis Cavini Ferreira", "Regina Drummond",
            "Regina Benitez", "Raymundo Magalhães", "Raul Fiker", "Raul Feteira", "Raphael Draccon", "Ramon Giraldi", "Ramon Bacelar",
            "Ramiro Giroldo", "Ramiro Brizola", "Raimundo Carrero", "Rafael Spinelli", "Rafael Monteiro", "Rafael Lima", "Rafael Kasper",
            "Rafael", "Iron", "Olhaberriet", "Rafael de Agostini Ferreira", "Rafael Cruz", "Rafael Ban Jacobsen", "Rachel de Queiroz",
            "R. Magalhães Junior", "R. Lovato", "R. F. Lucchetti", "R. C. Nascimento", "Priscilla Matsumoto", "Pólo Noel Atan",
            "Plínio Martins Filho", "Plínio Cabral", "Phaulo Gonçalves", "Peterso Rissatti", "Pete Rissatti", "Pereira Lima", "Pena Cabreira",
            "Pedro José Ferreira da Silva", "Pedro Faria", "Pedro Cavini Ferreira", "Paulo Vicente dos Santos Alves", "Paulo Soriano",
            "Paulo Silveira", "Paulo Sandrini", "Paulo Rónai", "Paulo Rios", "Paulo Rangel", "Paulo Mendes Campos", "Paulo Franchetti",
            "Paulo Fodra", "Paulo Elache", "Paulo Dumi", "Paulo Chede Domingos", "Paulo César Born Martinelli", "Paula Mastroberti",
            "Patrícia Ananias da Silva", "Paola Victória Baggio", "Pantaleão Antonio Aniello Perillo", "Paffomiloff der Engel", "Paffomiloff",
            "Ozias Filho", "Otávio Niewinski", "Otacílio Costa d'Assunção Barros", "Otacílio Colares", "Ota", "Osmarco Valladão", "Osman Matos",
            "Osíris Reis", "Osias Gomes", "Oscar Cesarotto", "Osame Kinouchi Filho", "Orlando Paes Filho", "Orígenes Lessa", "Orfeu Brocco",
            "Omar Albio dos Santos Filho", "Olivia Maia", "Oghan N'Thanda", "Odete Rios", "Octávio de Faria", "Octavio Cariello", "Octavio Aragão",
            "O. B. R. Diamor", "Norberto Silva", "Nilza Amaral", "Nilson D. Martello", "Nikelen Witter", "Nicolau Sevcenko", "Nicolas Vasconcelos",
            "Newton Ribeiro Rocha", "Neusa Ximenes", "Nelson Palma Travassos", "Nelson de Oliveira", "Nelson Moraes", "Nelson Magrini",
            "Nelly Cecília Paiva Barreto da Rocha", "Nazarethe Fonseca", "Natalia Yudenitsch", "Natália Couto Azevedo", "Nahum Sirotsky",
            "Murilo Rubião", "Mr. Quadrinhos", "Morgana de Avalon", "Monteiro Lobato", "Mônica Virgo", "Monica Sicuro", "Moisés Baumstein",
            "Moebius Ring", "Moacyr Scliar", "Moacyr Godoy Moreira", "Milton Hatoum", "Millôr Fernandes", "Miguel Yasbeck", "Miguel Pérez",
            "Miguel Patrício Gomes", "Miguel M. Abrahão", "Miguel Jorge", "Miguel Carqueija", "Miguel Angel Pérez Correa", "Michelle Klautau",
            "Michael Santana", "Menotti del Picchia", "Menalton Braff", "Mello Franco, Jr.", "Melissa de Sá", "Medeiros e Albuquerque", "MCPOCO",
            "Mayrant Gallo", "May Parreira e Ferreira", "Maxwell Gun", "Maxs Portes", "Máximo Martins", "Maximiano de Figueiredo Portes",
            "Maximiano Campos", "Max Mallmann", "Mauro Chaves", "Mauro Brandão Lopes", "Maurício Wojciekowski", "Maurício Robe Barbosa",
            "Maurício Montenegro", "Maurício Gagliardi", "Maurício Bugarin", "Mauren Guedes Müller", "Matias Perazoli", "Martha Argel",
            "Marta Rolim", "Marta Machado", "Marta de Senna", "Marne Lucio Guedes", "Marlon Teske", "Mário Sanchez", "Mário Kuperman",
            "Mário Carneiro Jr.", "Mário Carneiro", "Marien Calixte", "Mariana Albuquerque", "Maria Theresa Abelha Alves", "Maria Teresa Rodrigues",
            "Maria Nazareth Alvim de Barros", "Maria Lúcia Perrone Passos", "Maria José Silveira", "Maria Helena Bandeira",
            "Maria Filomena C. L. dos Santos", "Maria Elisa Cervasco", "Maria de Lourdes Teixeira", "Maria de Lourdes Micaldas",
            "Maria de Lourdes Barbosa Corrêa", "Maria da Glória Bordini", "Maria Clotilde B. Vieira", "Maria Aparecida Santilli",
            "Maria Alzira Brum Lemos", "Maria Alice A. Sampaio Dória", "Marcos Rogério Estevam", "Marcos Rey", "Marcos Menezes",
            "Marcos Lopes", "Marcos Baumann", "Marcos A. Melo", "Marco Fontoura", "Marco Bourguignon", "Marco Aurélio Lucchetti",
            "Marco Antônio de Araújo Bueno", "Márcio Souza", "Márcio Renato Bordin", "Marcio Massula Jr.", "Marcio Domenes",
            "Márcio Dison", "Marcio de Lemos", "Márcio Calegaro", "Márcio Bordin", "Márcio Aragão", "Marcia Szajnbok", "Márcia Olivieri",
            "Márcia Maciel", "Marcia Kupstas", "Márcia Guimarães", "Marcelo Utumi", "Marcelo Santoro", "Marcelo Rubens Paiva",
            "Marcelo Pirani Vieira", "Marcelo Milici", "Marcelo Maluf", "Marcelo L. Bighetti", "Marcelo Juchem", "Marcelo Jacinto Ribeiro",
            "Marcelo Galvão", "Marcelo Forlani", "Marcelo Ferroni", "Marcelo Ferlin Assami", "Marcelo Dias Amado", "Marcelo de Oliveira Souza",
            "Marcelo Cassaro", "Marcelo Biguetti", "Marcelo Baldini", "Marcelo Backes", "Marcello Simão Branco", "Marcelino Freire", "Marcela Godoy",
            "Marcel Breton", "Manuel da Costa Pinto", "Manuel Cavalcanti Proença", "Manuel Bandeira", "Manoel Odorico Mendes", "Mairy Sarmanho",
            "Mairy Saramanho", "Magalhães Neto", "Magalhães de Azeredo", "Madô Martins", "Machado de Assis", "M. R. R. Olivieri", "M. D. Amado",
            "M. Cavalcanti Proença", "Lygia Fagundes Telles", "Luzia de Maria", "Luiz Zatar", "Luiz Roberto Guedes", "Luiz Poleto",
            "Luiz Marcos da Fonseca", "Luiz Hasse", "Luiz Galdino", "Luiz Fernando Riesemberg", "Luiz Felipe Viola", "Luiz Felipe Vasques",
            "Luiz Canabrava", "Luiz Bras", "Luiz Beltrão", "Luiz Armando Braga", "Luís Roberto Amabile", "Luís Henrique Pellanda", "Luís Giffoni",
            "Luis Fernando Veríssimo", "Luis Eduardo Matta", "Luis Dill", "Luís Carlos Lemos da Silva", "Luís Carlos Eiras",
            "Luís Augusto Campello Dill", "Luís A. Navarro", "Lúcio Marassi", "Lúcio Manfredi", "Luciano Rodrigues", "Luciano Barreto",
            "Luciano Alves", "Luciana Thomé", "Luciana Fátima", "Lúcia Sá", "Lúcia Machado de Almeida", "Lúcia Abbondatti", "Lucélia Rodrigues",
            "Lucas Rocha", "Lucas L. Rocha", "Lucas Fernando Maziero", "Luan Montà de Castro Pereira de Souza", "Lu Costa", "Lorna Dannan",
            "Lordsir Cabreira de Oliveira", "Londerson da Costa Araújo", "Lizy Tequila", "Livany Salles", "Lira Vargas", "Linx", "Lino França Jr.",
            "Lima Trindade", "Lima Barreto", "Liliana Medeiros", "Lilia Moritz Schwarcz", "Lília Aparecida Pereira da Silva", "Lidia Zuin",
            "Lia Neiva", "Levy Menezes", "Letícia Velásquez", "Leonel Caldela", "Leonardo Zanon", "Leonardo Siviotti", "Leonardo S.",
            "Leonardo Pezzella", "Leonardo Nunes", "Leonardo Nahum Farias", "Leonardo Nahoum", "Leonardo Fróes", "Leonardo Carrion",
            "Leonardo Cabral", "Leon Eliachar", "Léo Nogueira", "Léo Godoy Otero", "Lélia Maria Parreira Duarte", "Leandro Reis", "Leandro Radrak",
            "Leandro Luiz", "Leandro Leite Leocadio", "Leandro Chernicharo", "Leandra Lambert", "Léa Masina", "Laurita Mourão", "Laura Fuentes",
            "Larissa Redeker", "Larissa Caruso", "Laris Neal", "Lancast Mota", "Laíza Verçosa do Nascimento", "Lainister de Oliveira Esteves",
            "Laila Ribeiro", "Laerte Francisco Lemmi", "Lady Sybylla", "Lady Blond", "L. F. Riesemberg", "Kristian Moura", "Kofal Filho",
            "Kizzy Ysatis", "Késsia Nina", "Kelvin K.", "Kathia Brienza", "Karina Brossi", "Karen Alvares", "Junior Cazeri", "Júlio Emílio Braz",
            "Juliano Sasseron", "Juliano B. Alves", "Juliana Lopes", "Juliana Calderari", "Juarez Guedes Cruz", "Jota Marques", "Josué Oliveira",
            "Josué Montello", "Josué Guimarães", "Josiel Vieira", "Joshua Falken", "José Thomaz Brum", "José S. Fernandes", "Jose Ronaldo Viega Alves",
            "José Roberto Vieira", "José Paulo Paes", "José Neres", "José Maria Rodrigues Filho", "José Maria Doménech Tarafa",
            "José Maria Doménech T.", "José Luiz S. Nóbrega", "José Luiz Nunes", "José Luiz Aidar", "José Joaquim Medeiros de Albuquerque",
            "José Guilherme Correa Pinto", "José Geraldo Vieira", "José Geraldo Couto", "José Fernandes", "José dos Santos Fernandes",
            "José de Paula Ramos, Jr.", "José Castello", "José Carlos Neves", "José Carlos da Silva", "Jorge Schwartz", "Jorge Rachaus",
            "Jorge Murad", "Jorge Moreira Nunes", "Jorge Luiz Calife", "Jorge Amado", "Jonatas Turcato Syrayama", "John Dekowes", "Johannes Newton",
            "Joaquim Manuel de Macedo", "Joaquim Gomes", "João Ubaldo Ribeiro", "João Ribeiro", "João Ribas da Costa", "João Paulo Vaz"}));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcEditora = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jcAutor = new javax.swing.JComboBox<>();
        txtVolume = new javax.swing.JTextField();
        txtAnoEdicao = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setTitle("Sistema de Biblioteca - Cadastro de Livro");

        jLabel1.setText("Título");

        jLabel2.setText("Autor");

        jLabel3.setText("Editora");

        jLabel4.setText("Quant.");

        jLabel5.setText("Edição");

        jcAutor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jcAutorAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jcAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAutorActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btEditar.setText("Editar");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("Cadastro de Livro");

        jLabel6.setText("ID");

        jLabel8.setText("(Pesquisa)");

        jLabel9.setText("Local");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/livros.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel10)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(btSalvar)
                        .addGap(38, 38, 38)
                        .addComponent(btEditar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLocal))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jcEditora, javax.swing.GroupLayout.Alignment.LEADING, 0, 223, Short.MAX_VALUE)
                                            .addComponent(jcAutor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtAnoEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel7)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtAnoEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btEditar))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(773, 596));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if ("".equals(txtTitulo.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o título do livro", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("Selecionar".equals(jcAutor.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Selecione o autor do livro", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("Selecionar".equals(jcEditora.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Selecione a editora do livro", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("".equals(txtAnoEdicao.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o ano da edição do livro", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("".equals(txtVolume.getText())) {
            JOptionPane.showMessageDialog(null, "Digite a quantidade que será inserida na biblioteca", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else {

            Livro livro = new Livro();

            //livro.setIdLivro(Integer.parseInt(txtId.getText()));
            livro.setTitulo(txtTitulo.getText());
            livro.setAutor(jcAutor.getSelectedItem().toString());
            livro.setEditora(jcEditora.getSelectedItem().toString());
            livro.setAnoEdicao(txtAnoEdicao.getText());
            livro.setVolume(Integer.parseInt(txtVolume.getText()));
            livro.setLocal(txtLocal.getText());

            Dao dao = new Dao();
            int resp;
            boolean status;

            status = dao.conectar();
            if (status == false) {
                JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados.");
            } else {
                resp = dao.salvarLivro(livro);
                if (resp == 1) {
                    JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
                     limpar();
                } else if (resp == 1062) {
                    JOptionPane.showMessageDialog(null, "ID já cadastrada.");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao tentar salvar os dados.");
                }
                dao.desconectar();
            }
        }


    }//GEN-LAST:event_btSalvarActionPerformed
    public void limpar() {//METODO QUE LIMPAR OS CAMPOS PREENCHIDO
        txtTitulo.setText(null);
        txtLocal.setText(null);
        txtVolume.setText(null);
        txtAnoEdicao.setText(null);
        jcAutor.setSelectedItem("Selecionar");
        jcEditora.setSelectedItem("Selecionar");
    }
    private void jcAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcAutorActionPerformed

    private void jcAutorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcAutorAncestorAdded
//       Dao dao = new Dao();
//       List<Autor>ListadeAutores = dao.listaAutores();
//       jcAutor.removeAll();

    }//GEN-LAST:event_jcAutorAncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jcAutor;
    private javax.swing.JComboBox<String> jcEditora;
    private javax.swing.JTextField txtAnoEdicao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtVolume;
    // End of variables declaration//GEN-END:variables
}
