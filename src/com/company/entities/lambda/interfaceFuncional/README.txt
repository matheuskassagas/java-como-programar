Interface Funcional
é uma interface que possui um unico metodo abstrado. Sua implementações serão tratadas como expressões lambda;

Algumas interfaces funcionais:

- Predicate - interface possui um metodo generico <T>, retorna um boolean

- Function - interface possui dois parametros tipo <T, R>, um apply que recebe um objeto tipo <T> e retorna um tipo <R>

- Consumer - interface possui um metodo generico <T>, unico metodo abstrado accept, que recebe um tipo T (void)