$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("desconto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Receber desconto da qazando",
  "description": "        Eu como usuário da qazando\r\n        quero receber um cupom de desconto\r\n        para comprar um curso com valor reduzido",
  "id": "receber-desconto-da-qazando",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@desconto"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "visualizar código de desconto",
  "description": "",
  "id": "receber-desconto-da-qazando;visualizar-código-de-desconto",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 8,
      "name": "@gerar-cupom"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que estou no site da qazando",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "eu preencho meu e-mail",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "clico em ganha cupom",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "eu vejo o código de desconto",
  "keyword": "Então "
});
formatter.match({
  "location": "DescontosStep.acessar_site_qazando()"
});
formatter.result({
  "duration": 4603012400,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.eu_preencho_meu_e_mail()"
});
formatter.result({
  "duration": 2126188100,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.clico_em_ganha_cupom()"
});
formatter.result({
  "duration": 88179900,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.eu_vejo_o_código_de_desconto()"
});
formatter.result({
  "duration": 63381900,
  "status": "passed"
});
formatter.uri("verCursos.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "ver todos os cursos disponiveis pela Qazando",
  "description": "Eu como usuário da qazando\r\nquero saber quais os cursos oferecidos pelo site\r\npara que eu realize a compra",
  "id": "ver-todos-os-cursos-disponiveis-pela-qazando",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 9,
  "name": "Visualizar cursos",
  "description": "",
  "id": "ver-todos-os-cursos-disponiveis-pela-qazando;visualizar-cursos",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 10,
  "name": "eu clico no botão ver cursos",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "visualizo os cursos disponiveis pela qazando",
  "keyword": "Então "
});
formatter.match({
  "location": "VerCursosStep.eu_clico_no_botão_ver_cursos()"
});
formatter.result({
  "duration": 2054118200,
  "status": "passed"
});
formatter.match({
  "location": "VerCursosStep.visualizo_cursos_disponiveis_pela_qazando()"
});
formatter.result({
  "duration": 60888500,
  "status": "passed"
});
});