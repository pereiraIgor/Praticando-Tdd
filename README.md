# TDD (Test-driven development)
- O desenvolvimento orientado a testes ( TDD ) é um processo de desenvolvimento de software que depende de requisitos de software sendo convertidos em casos de teste antes que o software seja totalmente desenvolvido e rastreando todo o desenvolvimento de software testando repetidamente o software em todos os casos de teste. Isso é diferente de o software ser desenvolvido primeiro e os casos de teste criados posteriormente. [Mais Informações](https://en.wikipedia.org/wiki/Test-driven_development)

## Verificação e Validação de Software

- Este repositório contém um exercício para a disciplina de Verificação e Validação de Software do semestre 2022.1, ministrada pelo professor Everton.
- [Especificação da Atividade](https://docs.google.com/document/d/1Xc04sNt2q1HWb9h4LCdvHe8JkUy6PtGsOmNMoR3UoMk/edit#)
- Com base na especificação da atividade os problemas propostos ficaram divididos da seguinte maneira:
    - Filtro de Faturas (Nícolas Moreira Nobre Leite)
        - OBS: Considere o nome como identificador único do Cliente e que um Cliente só pode existir quando uma fatura é criada para esse cenário
    - Calculadora de Salários (Igor de Sousa Pereira)

## Experiência com TDD
- Nícolas
    - Pode-se dizer que TDD é uma das formas mais eficientes de programação para quem está acostumado a programar dessa maneira. Por conta de vícios de programação, bem como outros costumes, posso dizer que não gostei da experiência, me atrasando bastante em algumas funcionalidades simples, como instanciação de classes, para poder se adaptar a essa técnica. Uma vez que é importante a realização de passos extremamente pequenos na codificação de algumas funcionalidades, seguindo o TDD, coisas óbvias que poderiam ser resolvidas rapidamente acabam tomando mais tempo. Entretanto, é importante ressaltar que essa prática lhe dá muita confiança de que seu código "funciona" para casos básicos de teste, visto que os codificamos primeiro, evitando que você fique re-visitando seu código para casos que já funcionam. Sendo assim, a experiência no geral não foi agradável, mas creio que se trata muito mais de hábito e costume, do que necessariamente não "gostar" desse tipo de desenvolvimento.
- Igor
    - O uso de tdd é uma pratica bastante interessante para conhecimento, pois tem uma abordagem totalmente diferente ao que estamos acostumados. Porém, tal metodo gera bastante dificuldade pois, para simples operaçoes como instanciação de classes ou simples chamadas de metodo, um teste precisa ser criado antes, sendo assim, deve-se imaginar quais são os atributos que serão recebidos no metodo. Pensar um teste antes da implementação gera uma confusão a partir do que acabei de dizer. Essa pratica seria bastante eficiente em ensinar logo nos primeiros semestres da graduação, pois muitos erros poderiam ser evitados dessa forma. Ela foi boa em me fazer pensar num teste que valida a função antes, porem foi ruim em relação a ter que criar um teste para uma simples instancia( ja fazia esse teste, mas era feito dentro do proprio codigo, e não em um codigo a parte). Por essa experiencia, percebi que demora um pouco mais para codificar algo, pois cada simples interação é necessario um teste, o que torna isso bastante chato. A maior dificuldade foi pensar em algo concreto antes de realmente codificar
