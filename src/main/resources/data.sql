create table
if not exists dti.postagem (
titulo varchar(255) not null,
texto LONGTEXT not null,
data DATE not null,
id bigint not null auto_increment,
primary key (id))
engine=InnoDB;

insert into dti.postagem (titulo, texto, data )
values ("Curso De Gestão de Projetos E Métodos Agile Gratuito Do Santander",
"Entenda o poder da Gestão de Projetos e dos métodos Agile com o Curso Santander na Santander Open Academy.\nDepois de concluir este curso, você receberá um certificado de conclusão que valida suas habilidades.\nDurante as 8 horas de aula, você conhecerá os fundamentos do gerenciamento de projetos sob a ótica das metodologias Agile, como o Scrum, que prioriza o trabalho em equipe e objetivos claros.\nO curso oferece a oportunidade de aplicar esses princípios diretamente em sua rotina profissional, e entender conceitos como Design Thinking e outros fundamentos do Scrum. " ,
"2024-05-22");

insert into dti.postagem (titulo, texto, data )
values ("Imersão Em Inteligência Artificial Gratuita Da XP Educação",
"A Imersão em Inteligência Artificial da XP Educação é um programa online e gratuito, com certificado, que tem o objetivo de acelerar carreiras e desenvolver profissionais de tecnologia capazes de se diferenciar.\nO aprendizado é completo, com conteúdos exclusivos, atualizados e uma linguagem didática, incluindo cases práticos e entrega de certificado.\nA imersão é ministrada por experts de tecnologia que vivenciam a IA diariamente, e o evento é guiado por especialistas do mercado, oferecendo mais de 10 horas de conteúdo exclusivo.\nA XP Educação oferece um programa online e gratuito, com certificado, que tem como foco impulsionar carreiras e capacitar profissionais de tecnologia para se destacarem. " ,
"2024-05-22");

insert into dti.postagem (titulo, texto, data )
values ("GF Cursos: Aprenda Gratuitamente HTML, PHP, Redes, Corel Draw E Outros",
"Conhecer e adquirir novas habilidades em tecnologias web nunca foi tão descomplicado e acessível como agora, graças à Plataforma GF Cursos.\nTendo uma grande lista de cursos gratuitos em áreas como HTML, PHP, Access, Digital Influencer, Marketing Digital e Redes, a plataforma oferece oportunidades valiosas de aprendizado para aqueles que buscam se destacar no mercado de trabalho.\nOs certificados da GF Cursos podem ser facilmente impressos ou salvos em PDF pelo aluno diretamente no site da plataforma, imediatamente após a conclusão do curso.\nEssa praticidade adiciona valor ao aprendizado e permite que os alunos validem suas conquistas de forma conveniente e rápida. " ,
"2024-05-21");

insert into dti.postagem (titulo, texto, data )
values ("Curso Gratuito de AZ-900 (Microsoft Azure Fundamentals) Da Ka Solution",
"O Curso Oficial  Microsoft Azure Fundamentals (AZ-900) é uma iniciativa exclusiva da KA Solution, projetada para capacitar profissionais que desejam mergulhar no ecossistema Azure.\nEsta formação, totalmente gratuita e à distância, é uma porta de entrada para aqueles que buscam compreender os serviços em nuvem e como o Microsoft Azure se destaca nesse cenário.\nMinistrado por dois especialistas MCTs (Microsoft Certified Trainer), o curso não só introduz os fundamentos dos serviços em nuvem, mas também prepara os alunos para explorar mais profundamente o universo do  Azure e de outras soluções da Microsoft.\nDepois de finalizar o curso, os participantes recebem um certificado e vouchers promocionais para a continuidade de sua formação no universo Azure.  " ,
"2024-05-20");

insert into dti.postagem (titulo, texto, data )
values ("Curso De Computação Em Nuvem Gratuito Com Voucher Para Certificação AWS Cloud",
"O Sebrae Startups, plataforma de iniciativas do Serviço Brasileiro de Apoio às Micro e Pequenas Empresas, em parceria com a Amazon Web Services (AWS), anuncia a abertura de um curso gratuito sobre computação em nuvem.\nEsta iniciativa, parte do projeto Startup na Nuvem, já está com inscrições abertas e visa capacitar estudantes e empreendedores com os fundamentos da computação em nuvem, acelerando o crescimento de suas startups.\nOs participantes terão acesso a uma variedade de conteúdos sob demanda, incluindo inteligência artificial generativa, e contarão com tutoria semanal. Um time de instrutores técnicos estará disponível para responder às dúvidas dos alunos em sessões ao vivo e por meio de um Fórum de Discussão.\nOs estudantes poderão utilizar a plataforma FirstJob, que os conecta diretamente com o mercado de trabalho. Aproveite esta oportunidade para entender os fundamentos da computação em nuvem e impulsionar sua startup com o treinamento gratuito oferecido pela Amazon Web Services (AWS)." ,
"2024-05-20");

insert into dti.postagem (titulo, texto, data )
values ("Curso Gratuito de AZ-900 (Microsoft Azure Fundamentals) Da Ka Solution",
"O Curso Oficial.Microsoft Azure Fundamentals (AZ-900) é uma iniciativa exclusiva da KA Solution, projetada para capacitar profissionais que desejam mergulhar no ecossistema Azure.\nEsta formação, totalmente gratuita e à distância, é uma porta de entrada para aqueles que buscam compreender os serviços em nuvem e como o Microsoft Azure se destaca nesse cenário.\nMinistrado por dois especialistas MCTs (Microsoft Certified Trainer), o curso não só introduz os fundamentos dos serviços em nuvem, mas também prepara os alunos para explorar mais profundamente o universo do Azure e de outras soluções da Microsoft.\n\nDepois de finalizar o curso, os participantes recebem um certificado e vouchers promocionais para a continuidade de sua formação no universo Azure!" ,
"2024-05-19");

insert into dti.postagem (titulo, texto, data )
values ("Cursos De Blockchain, Marketing E Outros Temas Gratuitos Do Descomplica",
"O portal Descomplica oferece cursos 100% gratuitos que estão fazendo a diferença na capacitação profissional.\nEstes cursos livres abrangem áreas como Blockchain e Marketing, proporcionando um impulso significativo ao currículo dos participantes.\nCada curso é estruturado com aulas teóricas, discussões práticas e atividades hands-on, garantindo uma experiência de aprendizado completa.\nOs alunos recebem materiais detalhados com lições aprendidas, permitindo a aplicação prática e eficaz do conhecimento adquirido ao final do curso." ,
"2024-05-19");