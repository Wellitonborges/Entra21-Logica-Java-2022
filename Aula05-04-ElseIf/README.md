# aprendendo sobre sobre else if

## incluindo novas perguntas no else de cada if 

> não há limites em relação a aumeto de condições em if, porem tem que tomar cuidado.
> pois fica a pergunta (não seria melhor um switch?)
> 
> porém quando utilizandos else if()
>
> se faz necessário fechar essa cadeia com um else final, por quetões de boas praticas.





```` java
if(condicao1){
  // se atender a condição 1
}else if(condicao2){ // so entra aqui se atender a condição
 // se atender a condição 2
}else if(condicaoN){ // so entra aqui se atender a condição
 // se atender a condição N
}else{ // seria a condição que sobrou
 //pode ter alguma ação, mas mesmo que não tenha escreva mesmo assim
}
````