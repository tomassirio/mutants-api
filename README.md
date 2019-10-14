<H1>MutantsApi</H1>

This app was built as a practice excercise for a Mercadolibre interview.

The instructions of this excercise are appointed on `Examen Mutantes-3.pdf` but are going to be described briefly on this Md.

<H3>Examen Mutantes</H3>

Given a String Array, determine if a genome is from a mutant or a human.

`boolean isMutant(String[] dna)`

Every array and string will have a length of N, converting it into an NxN char matrix.

<H7>Non-mutant example:</H7>

>A T G C G A 
>
>C A G T G C 
>
>T T A T T T 
>
>A G A C G G 
>
>G C G T C A
>
>T C A C T G 

<H7>Mutant example:</H7>

>**A** T G C **G** A
>
>C **A** G T **G** C
>
>T T **A** T **G** T
>
>A G A **A** **G** G
>
>**C C C C** T A
>
>T C A C T G

A DNA is determined as a mutant if you get at least two 4-lines of same chars (Horizontaly, Vertically or Diagonally)

Example of an input would be:

`String[] dna = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};`

<H4>Challenges:</H4>
<H5>Level 1</H5>
Code the given excercise in any language

<H5>Level 2</H5>
Create an api rest, host that api on a cloud computing service, create the service `/mutant/` where you can detect if a human is mutant sending an DNA sequence through an HTTP Post with a Json on the following Format:

>POST → /mutant/
>
>{
>“dna”:["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]
>}

A HTTP 200-Ok should be returned if we get a mutant. Instead, a 403-Forbidden should be returned in case it's a human

<H5>Level 3</H5>
Create a Database where the verified DNA's are saved.
Expose a service `/stats` where you can get a Json where you can see
the stats on the verified DNAs:
>ADN: {“count_mutant_dna”:40, “count_human_dna”:100: “ratio”:0.4}
---------------------------------------------------------

<H3>Steps Taken</H3>

- The Spring Environment was created through `https://start.spring.io`
which allows to create a Spring project in a couple of clicks.
Dependencies added: Web, JPA, Actuator, Devtools, MySql
- Swagger UI was added to control the API through a friendly UI
 
---------------------------------------------------------

<H3>TO DO</H3>
- Dockerize the app with docker-compose
- Host the app on AWS
- Adapt the Tests to the created Methods
- Create the /Stats Service
- Check the implementation on checkDiagonally()
