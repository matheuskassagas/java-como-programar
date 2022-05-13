🔸 Visão geral: Java Collections Framework e hierarquia

🔸 List
Coleção com iterações ordenadas: List
Conhecendo os métodos
Ordenação da coleção List

List<Double> notas = new ArrayList<Double>();
notas.add(7.0); #adiciona
notas.remove(7.0); #remove
notas.clear(); #limpa lista
notas.isEmpty(); #retorna true ou false . (lista vazia ou nao)
notas.size(); #tamanho
notas.indexOf(7.0); #busca a posição do valor escolhido
notas.add(2, 8d); #adiciona um valor na posição escolhida
notas.set(notas.indexOf(5d), 6.0); #substitui um valor na posição escolhida
notas.contains(5d); #verifica se o valor escolhido contem na lista
notas.get(2); #exibe o valor da posição do array escolhido
Collections.min(notas); #exibe o menor valor do array de notas
Collections.max(notas); #exibe o maior valor do array de notas
Collections.shuffle(notas); #faz a lista aleatoria
Collections.sort(notas); # ordem normal de como foi criada
  
Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

 System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }

🔸 Set
Coleção com singularidade: Set
Conhecendo os métodos
Ordenação da coleção Set

🔸 Map
Coleção de pares: Map
Conhecendo os métodos
Ordenação de Map

🔸 Stream API
Visão geral: Classe Anônima - Functional Interface - Lambda - Method Reference
Stream API
Conhecendo as operações
