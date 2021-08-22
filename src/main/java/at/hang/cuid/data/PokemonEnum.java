package at.hang.cuid.data;

import at.hang.cuid.util.AmIUtils;
import lombok.Getter;

import java.util.LinkedList;
import java.util.Locale;

public enum PokemonEnum
{
    BULBASAUR(1,"bulbasaur","bisasam"),
    IVYSAUR(2,"ivysaur","bisaknosp"),
    VENUSAUR(3,"venusaur","bisaflor","mega","gmax"),
    CHARMANDER(4,"charmander","glumanda"),
    CHARMELEON(5,"charmeleon","glutexo"),
    CHARIZARD(6,"charizard","glurak","megax","megay","gmax"),
    SQUIRTLE(7,"squirtle","schiggy"),
    WARTORTLE(8,"wartortle","schillok"),
    BLASTOISE(9,"blastoise","turtok","mega","gmax"),
    CATERPIE(10,"caterpie","raupy"),
    METAPOD(11,"metapod","safcon"),
    BUTTERFREE(12,"butterfree","smettbo","gmax"),
    WEEDLE(13,"weedle","hornliu"),
    KAKUNA(14,"kakuna","kokuna"),
    BEEDRILL(15,"beedrill","bibor","mega"),
    PIDGEY(16,"pidgey","taubsi"),
    PIDGEOTTO(17,"pidgeotto","tauboga"),
    PIDGEOT(18,"pidgeot","tauboss","mega"),
    RATTATA(19,"rattata","rattfratz","alola"),
    RATICATE(20,"raticate","rattikarl","alola","totemalola"),
    SPEAROW(21,"spearow","habitak"),
    FEAROW(22,"fearow","ibitak"),
    EKANS(23,"ekans","rettan"),
    ARBOK(24,"arbok","arbok"),
    PIKACHU(25,"pikachu","pikachu","rockstar","belle","popstar","phd","libre","cosplay","originalcap","hoenncap","sinnohcap","unovacap","kaloscap","alolacap","partnercap","gmax"),
    RAICHU(26,"raichu","raichu","alola"),
    SANDSHREW(27,"sandshrew","sandan","alola"),
    SANDSLASH(28,"sandslash","sandamer","alola"),
    NIDORAN_F(29,"nidoran-f","nidoran-f"),
    NIDORINA(30,"nidorina","nidorina"),
    NIDOQUEEN(31,"nidoqueen","nidoqueen"),
    NIDORAN_M(32,"nidoran-m","nidoran-m"),
    NIDORINO(33,"nidorino","nidorino"),
    NIDOKING(34,"nidoking","nidoking"),
    CLEFAIRY(35,"clefairy","piepi"),
    CLEFABLE(36,"clefable","pixi"),
    VULPIX(37,"vulpix","vulpix","alola"),
    NINETALES(38,"ninetales","vulnona","alola"),
    JIGGLYPUFF(39,"jigglypuff","pummeluff"),
    WIGGLYTUFF(40,"wigglytuff","knuddeluff"),
    ZUBAT(41,"zubat","zubat"),
    GOLBAT(42,"golbat","golbat"),
    ODDISH(43,"oddish","myrapla"),
    GLOOM(44,"gloom","duflor"),
    VILEPLUME(45,"vileplume","giflor"),
    PARAS(46,"paras","paras"),
    PARASECT(47,"parasect","parasek"),
    VENONAT(48,"venonat","bluzuk"),
    VENOMOTH(49,"venomoth","omot"),
    DIGLETT(50,"diglett","digda","alola"),
    DUGTRIO(51,"dugtrio","digdri","alola"),
    MEOWTH(52,"meowth","mauzi","alola","galar","gmax"),
    PERSIAN(53,"persian","snobilikat","alola"),
    PSYDUCK(54,"psyduck","enton"),
    GOLDUCK(55,"golduck","entoron"),
    MANKEY(56,"mankey","menki"),
    PRIMEAPE(57,"primeape","rasaff"),
    GROWLITHE(58,"growlithe","fukano"),
    ARCANINE(59,"arcanine","arkani"),
    POLIWAG(60,"poliwag","quapsel"),
    POLIWHIRL(61,"poliwhirl","quaputzi"),
    POLIWRATH(62,"poliwrath","quappo"),
    ABRA(63,"abra","abra"),
    KADABRA(64,"kadabra","kadabra"),
    ALAKAZAM(65,"alakazam","simsala","mega"),
    MACHOP(66,"machop","machollo"),
    MACHOKE(67,"machoke","maschock"),
    MACHAMP(68,"machamp","machomei","gmax"),
    BELLSPROUT(69,"bellsprout","knofensa"),
    WEEPINBELL(70,"weepinbell","ultrigaria"),
    VICTREEBEL(71,"victreebel","sarzenia"),
    TENTACOOL(72,"tentacool","tentacha"),
    TENTACRUEL(73,"tentacruel","tentoxa"),
    GEODUDE(74,"geodude","kleinstein","alola"),
    GRAVELER(75,"graveler","georok","alola"),
    GOLEM(76,"golem","geowaz","alola"),
    PONYTA(77,"ponyta","ponita","galar"),
    RAPIDASH(78,"rapidash","gallopa","galar"),
    SLOWPOKE(79,"slowpoke","flegmon","galar"),
    SLOWBRO(80,"slowbro","lahmus","mega","galar"),
    MAGNEMITE(81,"magnemite","magnetilo"),
    MAGNETON(82,"magneton","magneton"),
    FARFETCHD(83,"farfetchd","porenta","galar"),
    DODUO(84,"doduo","dodu"),
    DODRIO(85,"dodrio","dodri"),
    SEEL(86,"seel","jurob"),
    DEWGONG(87,"dewgong","jugong"),
    GRIMER(88,"grimer","sleima","alola"),
    MUK(89,"muk","sleimok","alola"),
    SHELLDER(90,"shellder","muschas"),
    CLOYSTER(91,"cloyster","austos"),
    GASTLY(92,"gastly","nebulak"),
    HAUNTER(93,"haunter","alpollo"),
    GENGAR(94,"gengar","gengar","mega","gmax"),
    ONIX(95,"onix","onix"),
    DROWZEE(96,"drowzee","traumato"),
    HYPNO(97,"hypno","hypno"),
    KRABBY(98,"krabby","krabby"),
    KINGLER(99,"kingler","kingler","gmax"),
    VOLTORB(100,"voltorb","voltobal"),
    ELECTRODE(101,"electrode","lektrobal"),
    EXEGGCUTE(102,"exeggcute","owei"),
    EXEGGUTOR(103,"exeggutor","kokowei","alola"),
    CUBONE(104,"cubone","tragosso"),
    MAROWAK(105,"marowak","knogga","alola","totem"),
    HITMONLEE(106,"hitmonlee","kicklee"),
    HITMONCHAN(107,"hitmonchan","nockchan"),
    LICKITUNG(108,"lickitung","schlurp"),
    KOFFING(109,"koffing","smogon"),
    WEEZING(110,"weezing","smogmog","galar"),
    RHYHORN(111,"rhyhorn","rihorn"),
    RHYDON(112,"rhydon","rizeros"),
    CHANSEY(113,"chansey","chaneira"),
    TANGELA(114,"tangela","tangela"),
    KANGASKHAN(115,"kangaskhan","kangama","mega"),
    HORSEA(116,"horsea","seeper"),
    SEADRA(117,"seadra","seemon"),
    GOLDEEN(118,"goldeen","goldini"),
    SEAKING(119,"seaking","golking"),
    STARYU(120,"staryu","sterndu"),
    STARMIE(121,"starmie","starmie"),
    MR_MIME(122,"mr-mime","pantimos","galar"),
    SCYTHER(123,"scyther","sichlor"),
    JYNX(124,"jynx","rossana"),
    ELECTABUZZ(125,"electabuzz","elektek"),
    MAGMAR(126,"magmar","magmar"),
    PINSIR(127,"pinsir","pinsir","mega"),
    TAUROS(128,"tauros","tauros"),
    MAGIKARP(129,"magikarp","karpador"),
    GYARADOS(130,"gyarados","garados","mega"),
    LAPRAS(131,"lapras","lapras","gmax"),
    DITTO(132,"ditto","ditto"),
    EEVEE(133,"eevee","evoli","gmax"),
    VAPOREON(134,"vaporeon","aquana"),
    JOLTEON(135,"jolteon","blitza"),
    FLAREON(136,"flareon","flamara"),
    PORYGON(137,"porygon","porygon"),
    OMANYTE(138,"omanyte","amonitas"),
    OMASTAR(139,"omastar","amoroso"),
    KABUTO(140,"kabuto","kabuto"),
    KABUTOPS(141,"kabutops","kabutops"),
    AERODACTYL(142,"aerodactyl","aerodactyl","mega"),
    SNORLAX(143,"snorlax","relaxo","gmax"),
    ARTICUNO(144,"articuno","arktos","galar"),
    ZAPDOS(145,"zapdos","zapdos","galar"),
    MOLTRES(146,"moltres","lavados","galar"),
    DRATINI(147,"dratini","dratini"),
    DRAGONAIR(148,"dragonair","dragonir"),
    DRAGONITE(149,"dragonite","dragoran"),
    MEWTWO(150,"mewtwo","mewtu","megax","megay"),
    MEW(151,"mew","mew"),
    CHIKORITA(152,"chikorita","endivie"),
    BAYLEEF(153,"bayleef","lorblatt"),
    MEGANIUM(154,"meganium","meganie"),
    CYNDAQUIL(155,"cyndaquil","feurigel"),
    QUILAVA(156,"quilava","igelavar"),
    TYPHLOSION(157,"typhlosion","tornupto"),
    TOTODILE(158,"totodile","karnimani"),
    CROCONAW(159,"croconaw","tyracroc"),
    FERALIGATR(160,"feraligatr","impergator"),
    SENTRET(161,"sentret","wiesor"),
    FURRET(162,"furret","wiesenior"),
    HOOTHOOT(163,"hoothoot","hoothoot"),
    NOCTOWL(164,"noctowl","noctuh"),
    LEDYBA(165,"ledyba","ledyba"),
    LEDIAN(166,"ledian","ledian"),
    SPINARAK(167,"spinarak","webarak"),
    ARIADOS(168,"ariados","ariados"),
    CROBAT(169,"crobat","iksbat"),
    CHINCHOU(170,"chinchou","lampi"),
    LANTURN(171,"lanturn","lanturn"),
    PICHU(172,"pichu","pichu"),
    CLEFFA(173,"cleffa","pii"),
    IGGLYBUFF(174,"igglybuff","fluffeluff"),
    TOGEPI(175,"togepi","togepi"),
    TOGETIC(176,"togetic","togetic"),
    NATU(177,"natu","natu"),
    XATU(178,"xatu","xatu"),
    MAREEP(179,"mareep","voltilamm"),
    FLAAFFY(180,"flaaffy","waaty"),
    AMPHAROS(181,"ampharos","ampharos","mega"),
    BELLOSSOM(182,"bellossom","blubella"),
    MARILL(183,"marill","marill"),
    AZUMARILL(184,"azumarill","azumarill"),
    SUDOWOODO(185,"sudowoodo","mogelbaum"),
    POLITOED(186,"politoed","quaxo"),
    HOPPIP(187,"hoppip","hoppspross"),
    SKIPLOOM(188,"skiploom","hubelupf"),
    JUMPLUFF(189,"jumpluff","papungha"),
    AIPOM(190,"aipom","griffel"),
    SUNKERN(191,"sunkern","sonnkern"),
    SUNFLORA(192,"sunflora","sonnflora"),
    YANMA(193,"yanma","yanma"),
    WOOPER(194,"wooper","felino"),
    QUAGSIRE(195,"quagsire","morlord"),
    ESPEON(196,"espeon","psiana"),
    UMBREON(197,"umbreon","nachtara"),
    MURKROW(198,"murkrow","kramurx"),
    SLOWKING(199,"slowking","laschoking","galar"),
    MISDREAVUS(200,"misdreavus","traunfugil"),
    UNOWN(201,"unown","icognito"),
    WOBBUFFET(202,"wobbuffet","woingenau"),
    GIRAFARIG(203,"girafarig","girafarig"),
    PINECO(204,"pineco","tannza"),
    FORRETRESS(205,"forretress","forstellka"),
    DUNSPARCE(206,"dunsparce","dummisel"),
    GLIGAR(207,"gligar","skorgla"),
    STEELIX(208,"steelix","stahlos","mega"),
    SNUBBULL(209,"snubbull","snubbull"),
    GRANBULL(210,"granbull","granbull"),
    QWILFISH(211,"qwilfish","baldorfish"),
    SCIZOR(212,"scizor","scherox","mega"),
    SHUCKLE(213,"shuckle","pottrott"),
    HERACROSS(214,"heracross","skaraborn","mega"),
    SNEASEL(215,"sneasel","sniebel"),
    TEDDIURSA(216,"teddiursa","teddiursa"),
    URSARING(217,"ursaring","ursaring"),
    SLUGMA(218,"slugma","schneckmag"),
    MAGCARGO(219,"magcargo","magcargo"),
    SWINUB(220,"swinub","quiekel"),
    PILOSWINE(221,"piloswine","keifel"),
    CORSOLA(222,"corsola","corasonn","galar"),
    REMORAID(223,"remoraid","remoraid"),
    OCTILLERY(224,"octillery","octillery"),
    DELIBIRD(225,"delibird","botogel"),
    MANTINE(226,"mantine","mantax"),
    SKARMORY(227,"skarmory","panzaeron"),
    HOUNDOUR(228,"houndour","hunduster"),
    HOUNDOOM(229,"houndoom","hundemon","mega"),
    KINGDRA(230,"kingdra","seedraking"),
    PHANPY(231,"phanpy","phanpy"),
    DONPHAN(232,"donphan","donphan"),
    PORYGON2(233,"porygon2","porygon2"),
    STANTLER(234,"stantler","damhirplex"),
    SMEARGLE(235,"smeargle","farbeagle"),
    TYROGUE(236,"tyrogue","rabauz"),
    HITMONTOP(237,"hitmontop","kapoera"),
    SMOOCHUM(238,"smoochum","kussilla"),
    ELEKID(239,"elekid","elekid"),
    MAGBY(240,"magby","magby"),
    MILTANK(241,"miltank","miltank"),
    BLISSEY(242,"blissey","heiteira"),
    RAIKOU(243,"raikou","raikou"),
    ENTEI(244,"entei","entei"),
    SUICUNE(245,"suicune","suicune"),
    LARVITAR(246,"larvitar","larvitar"),
    PUPITAR(247,"pupitar","pupitar"),
    TYRANITAR(248,"tyranitar","despotar","mega"),
    LUGIA(249,"lugia","lugia"),
    HO_OH(250,"ho-oh","ho-oh"),
    CELEBI(251,"celebi","celebi"),
    TREECKO(252,"treecko","geckarbor"),
    GROVYLE(253,"grovyle","reptain"),
    SCEPTILE(254,"sceptile","gewaldro","mega"),
    TORCHIC(255,"torchic","flemmli"),
    COMBUSKEN(256,"combusken","jungglut"),
    BLAZIKEN(257,"blaziken","lohgock","mega"),
    MUDKIP(258,"mudkip","hydropi"),
    MARSHTOMP(259,"marshtomp","moorabbel"),
    SWAMPERT(260,"swampert","sumpex","mega"),
    POOCHYENA(261,"poochyena","fiffyen"),
    MIGHTYENA(262,"mightyena","magnayen"),
    ZIGZAGOON(263,"zigzagoon","zigzachs","galar"),
    LINOONE(264,"linoone","geradaks","galar"),
    WURMPLE(265,"wurmple","waumpel"),
    SILCOON(266,"silcoon","schaloko"),
    BEAUTIFLY(267,"beautifly","papinella"),
    CASCOON(268,"cascoon","panekon"),
    DUSTOX(269,"dustox","pudox"),
    LOTAD(270,"lotad","loturzel"),
    LOMBRE(271,"lombre","lombrero"),
    LUDICOLO(272,"ludicolo","kappalores"),
    SEEDOT(273,"seedot","samurzel"),
    NUZLEAF(274,"nuzleaf","blanas"),
    SHIFTRY(275,"shiftry","tengulist"),
    TAILLOW(276,"taillow","schwalbini"),
    SWELLOW(277,"swellow","schwalboss"),
    WINGULL(278,"wingull","wingull"),
    PELIPPER(279,"pelipper","pelipper"),
    RALTS(280,"ralts","trasla"),
    KIRLIA(281,"kirlia","kirlia"),
    GARDEVOIR(282,"gardevoir","guardevoir","mega"),
    SURSKIT(283,"surskit","gehweiher"),
    MASQUERAIN(284,"masquerain","maskeregen"),
    SHROOMISH(285,"shroomish","knilz"),
    BRELOOM(286,"breloom","kapilz"),
    SLAKOTH(287,"slakoth","bummelz"),
    VIGOROTH(288,"vigoroth","muntier"),
    SLAKING(289,"slaking","letarking"),
    NINCADA(290,"nincada","nincada"),
    NINJASK(291,"ninjask","ninjask"),
    SHEDINJA(292,"shedinja","ninjatom"),
    WHISMUR(293,"whismur","flurmel"),
    LOUDRED(294,"loudred","krakeelo"),
    EXPLOUD(295,"exploud","krawumms"),
    MAKUHITA(296,"makuhita","makuhita"),
    HARIYAMA(297,"hariyama","hariyama"),
    AZURILL(298,"azurill","azurill"),
    NOSEPASS(299,"nosepass","nasgnet"),
    SKITTY(300,"skitty","eneco"),
    DELCATTY(301,"delcatty","enekoro"),
    SABLEYE(302,"sableye","zobiris","mega"),
    MAWILE(303,"mawile","flunkifer","mega"),
    ARON(304,"aron","stollunior"),
    LAIRON(305,"lairon","stollrak"),
    AGGRON(306,"aggron","stolloss","mega"),
    MEDITITE(307,"meditite","meditie"),
    MEDICHAM(308,"medicham","meditalis","mega"),
    ELECTRIKE(309,"electrike","frizelbliz"),
    MANECTRIC(310,"manectric","voltenso","mega"),
    PLUSLE(311,"plusle","plusle"),
    MINUN(312,"minun","minun"),
    VOLBEAT(313,"volbeat","volbeat"),
    ILLUMISE(314,"illumise","illumise"),
    ROSELIA(315,"roselia","roselia"),
    GULPIN(316,"gulpin","schluppuck"),
    SWALOT(317,"swalot","schlukwech"),
    CARVANHA(318,"carvanha","kanivanha"),
    SHARPEDO(319,"sharpedo","tohaido","mega"),
    WAILMER(320,"wailmer","wailmer"),
    WAILORD(321,"wailord","wailord"),
    NUMEL(322,"numel","camaub"),
    CAMERUPT(323,"camerupt","camerupt","mega"),
    TORKOAL(324,"torkoal","qurtel"),
    SPOINK(325,"spoink","spoink"),
    GRUMPIG(326,"grumpig","groink"),
    SPINDA(327,"spinda","pandir"),
    TRAPINCH(328,"trapinch","knacklion"),
    VIBRAVA(329,"vibrava","vibrava"),
    FLYGON(330,"flygon","libelldra"),
    CACNEA(331,"cacnea","tuska"),
    CACTURNE(332,"cacturne","noktuska"),
    SWABLU(333,"swablu","wablu"),
    ALTARIA(334,"altaria","altaria","mega"),
    ZANGOOSE(335,"zangoose","sengo"),
    SEVIPER(336,"seviper","vipitis"),
    LUNATONE(337,"lunatone","lunastein"),
    SOLROCK(338,"solrock","sonnfel"),
    BARBOACH(339,"barboach","schmerbe"),
    WHISCASH(340,"whiscash","welsar"),
    CORPHISH(341,"corphish","krebscorps"),
    CRAWDAUNT(342,"crawdaunt","krebutack"),
    BALTOY(343,"baltoy","puppance"),
    CLAYDOL(344,"claydol","lepumentas"),
    LILEEP(345,"lileep","liliep"),
    CRADILY(346,"cradily","wielie"),
    ANORITH(347,"anorith","anorith"),
    ARMALDO(348,"armaldo","armaldo"),
    FEEBAS(349,"feebas","barschwa"),
    MILOTIC(350,"milotic","milotic"),
    CASTFORM(351,"castform","formeo","sunny","rainy","snowy"),
    KECLEON(352,"kecleon","kecleon"),
    SHUPPET(353,"shuppet","shuppet"),
    BANETTE(354,"banette","banette","mega"),
    DUSKULL(355,"duskull","zwirrlicht"),
    DUSCLOPS(356,"dusclops","zwirrklop"),
    TROPIUS(357,"tropius","tropius"),
    CHIMECHO(358,"chimecho","palimpalim"),
    ABSOL(359,"absol","absol","mega"),
    WYNAUT(360,"wynaut","isso"),
    SNORUNT(361,"snorunt","schneppke"),
    GLALIE(362,"glalie","firnontor","mega"),
    SPHEAL(363,"spheal","seemops"),
    SEALEO(364,"sealeo","seejong"),
    WALREIN(365,"walrein","walraisa"),
    CLAMPERL(366,"clamperl","perlu"),
    HUNTAIL(367,"huntail","aalabyss"),
    GOREBYSS(368,"gorebyss","saganabyss"),
    RELICANTH(369,"relicanth","relicanth"),
    LUVDISC(370,"luvdisc","liebiskus"),
    BAGON(371,"bagon","kindwurm"),
    SHELGON(372,"shelgon","draschel"),
    SALAMENCE(373,"salamence","brutalanda","mega"),
    BELDUM(374,"beldum","tanhel"),
    METANG(375,"metang","metang"),
    METAGROSS(376,"metagross","metagross","mega"),
    REGIROCK(377,"regirock","regirock"),
    REGICE(378,"regice","regice"),
    REGISTEEL(379,"registeel","registeel"),
    LATIAS(380,"latias","latias","mega"),
    LATIOS(381,"latios","latios","mega"),
    KYOGRE(382,"kyogre","kyogre","primal"),
    GROUDON(383,"groudon","groudon","primal"),
    RAYQUAZA(384,"rayquaza","rayquaza","mega"),
    JIRACHI(385,"jirachi","jirachi"),
    DEOXYS(386,"deoxys","deoxys","normal","attack","defense","speed"),
    TURTWIG(387,"turtwig","chelast"),
    GROTLE(388,"grotle","chelcarain"),
    TORTERRA(389,"torterra","chelterrar"),
    CHIMCHAR(390,"chimchar","panflam"),
    MONFERNO(391,"monferno","panpyro"),
    INFERNAPE(392,"infernape","panferno"),
    PIPLUP(393,"piplup","plinfa"),
    PRINPLUP(394,"prinplup","pliprin"),
    EMPOLEON(395,"empoleon","impoleon"),
    STARLY(396,"starly","staralili"),
    STARAVIA(397,"staravia","staravia"),
    STARAPTOR(398,"staraptor","staraptor"),
    BIDOOF(399,"bidoof","bidiza"),
    BIBAREL(400,"bibarel","bidifas"),
    KRICKETOT(401,"kricketot","zirpurze"),
    KRICKETUNE(402,"kricketune","zirpeise"),
    SHINX(403,"shinx","sheinux"),
    LUXIO(404,"luxio","luxio"),
    LUXRAY(405,"luxray","luxtra"),
    BUDEW(406,"budew","knospi"),
    ROSERADE(407,"roserade","roserade"),
    CRANIDOS(408,"cranidos","koknodon"),
    RAMPARDOS(409,"rampardos","rameidon"),
    SHIELDON(410,"shieldon","schilterus"),
    BASTIODON(411,"bastiodon","bollterus"),
    BURMY(412,"burmy","burmy"),
    WORMADAM(413,"wormadam","burmadame","plant","sandy","trash"),
    MOTHIM(414,"mothim","moterpel"),
    COMBEE(415,"combee","wadribie"),
    VESPIQUEN(416,"vespiquen","honweisel"),
    PACHIRISU(417,"pachirisu","pachirisu"),
    BUIZEL(418,"buizel","bamelin"),
    FLOATZEL(419,"floatzel","bojelin"),
    CHERUBI(420,"cherubi","kikugi"),
    CHERRIM(421,"cherrim","kinoso"),
    SHELLOS(422,"shellos","schalellos"),
    GASTRODON(423,"gastrodon","gastrodon"),
    AMBIPOM(424,"ambipom","ambidiffel"),
    DRIFLOON(425,"drifloon","driftlon"),
    DRIFBLIM(426,"drifblim","drifzepeli"),
    BUNEARY(427,"buneary","haspiror"),
    LOPUNNY(428,"lopunny","schlapor","mega"),
    MISMAGIUS(429,"mismagius","traunmagil"),
    HONCHKROW(430,"honchkrow","kramshef"),
    GLAMEOW(431,"glameow","charmian"),
    PURUGLY(432,"purugly","shnurgarst"),
    CHINGLING(433,"chingling","klingplim"),
    STUNKY(434,"stunky","skunkapuh"),
    SKUNTANK(435,"skuntank","skuntank"),
    BRONZOR(436,"bronzor","bronzel"),
    BRONZONG(437,"bronzong","bronzong"),
    BONSLY(438,"bonsly","mobai"),
    MIME_JR(439,"mime-jr","pantimimi"),
    HAPPINY(440,"happiny","wonneira"),
    CHATOT(441,"chatot","plaudagei"),
    SPIRITOMB(442,"spiritomb","kryppuk"),
    GIBLE(443,"gible","kaumalat"),
    GABITE(444,"gabite","knarksel"),
    GARCHOMP(445,"garchomp","knakrack","mega"),
    MUNCHLAX(446,"munchlax","mampfaxo"),
    RIOLU(447,"riolu","riolu"),
    LUCARIO(448,"lucario","lucario","mega"),
    HIPPOPOTAS(449,"hippopotas","hippopotas"),
    HIPPOWDON(450,"hippowdon","hippoterus"),
    SKORUPI(451,"skorupi","pionskora"),
    DRAPION(452,"drapion","piondragi"),
    CROAGUNK(453,"croagunk","glibunkel"),
    TOXICROAK(454,"toxicroak","toxiquak"),
    CARNIVINE(455,"carnivine","venuflibis"),
    FINNEON(456,"finneon","finneon"),
    LUMINEON(457,"lumineon","lumineon"),
    MANTYKE(458,"mantyke","mantirps"),
    SNOVER(459,"snover","shnebedeck"),
    ABOMASNOW(460,"abomasnow","rexblisar","mega"),
    WEAVILE(461,"weavile","snibunna"),
    MAGNEZONE(462,"magnezone","magnezone"),
    LICKILICKY(463,"lickilicky","schlurplek"),
    RHYPERIOR(464,"rhyperior","rihornior"),
    TANGROWTH(465,"tangrowth","tangoloss"),
    ELECTIVIRE(466,"electivire","elevoltek"),
    MAGMORTAR(467,"magmortar","magbrant"),
    TOGEKISS(468,"togekiss","togekiss"),
    YANMEGA(469,"yanmega","yanmega"),
    LEAFEON(470,"leafeon","folipurba"),
    GLACEON(471,"glaceon","glaziola"),
    GLISCOR(472,"gliscor","skorgro"),
    MAMOSWINE(473,"mamoswine","mamutel"),
    PORYGON_Z(474,"porygon-z","porygon-z"),
    GALLADE(475,"gallade","galagladi","mega"),
    PROBOPASS(476,"probopass","voluminas"),
    DUSKNOIR(477,"dusknoir","zwirrfinst"),
    FROSLASS(478,"froslass","frosdedje"),
    ROTOM(479,"rotom","rotom","heat","wash","frost","fan","mow"),
    UXIE(480,"uxie","selfe"),
    MESPRIT(481,"mesprit","vesprit"),
    AZELF(482,"azelf","tobutz"),
    DIALGA(483,"dialga","dialga"),
    PALKIA(484,"palkia","palkia"),
    HEATRAN(485,"heatran","heatran"),
    REGIGIGAS(486,"regigigas","regigigas"),
    GIRATINA(487,"giratina","giratina","altered","origin"),
    CRESSELIA(488,"cresselia","cresselia"),
    PHIONE(489,"phione","phione"),
    MANAPHY(490,"manaphy","manaphy"),
    DARKRAI(491,"darkrai","darkrai"),
    SHAYMIN(492,"shaymin","shaymin","land","sky"),
    ARCEUS(493,"arceus","arceus"),
    VICTINI(494,"victini","victini"),
    SNIVY(495,"snivy","serpifeu"),
    SERVINE(496,"servine","efoserp"),
    SERPERIOR(497,"serperior","serpiroyal"),
    TEPIG(498,"tepig","floink"),
    PIGNITE(499,"pignite","ferkokel"),
    EMBOAR(500,"emboar","flambirex"),
    OSHAWOTT(501,"oshawott","ottaro"),
    DEWOTT(502,"dewott","zwottronin"),
    SAMUROTT(503,"samurott","admurai"),
    PATRAT(504,"patrat","nagelotz"),
    WATCHOG(505,"watchog","kukmarda"),
    LILLIPUP(506,"lillipup","yorkleff"),
    HERDIER(507,"herdier","terribark"),
    STOUTLAND(508,"stoutland","bissbark"),
    PURRLOIN(509,"purrloin","felilou"),
    LIEPARD(510,"liepard","kleoparda"),
    PANSAGE(511,"pansage","vegimak"),
    SIMISAGE(512,"simisage","vegichita"),
    PANSEAR(513,"pansear","grillmak"),
    SIMISEAR(514,"simisear","grillchita"),
    PANPOUR(515,"panpour","sodamak"),
    SIMIPOUR(516,"simipour","sodachita"),
    MUNNA(517,"munna","somniam"),
    MUSHARNA(518,"musharna","somnivora"),
    PIDOVE(519,"pidove","dusselgurr"),
    TRANQUILL(520,"tranquill","navitaub"),
    UNFEZANT(521,"unfezant","fasasnob"),
    BLITZLE(522,"blitzle","elezeba"),
    ZEBSTRIKA(523,"zebstrika","zebritz"),
    ROGGENROLA(524,"roggenrola","kiesling"),
    BOLDORE(525,"boldore","sedimantur"),
    GIGALITH(526,"gigalith","brockoloss"),
    WOOBAT(527,"woobat","fleknoil"),
    SWOOBAT(528,"swoobat","fletiamo"),
    DRILBUR(529,"drilbur","rotomurf"),
    EXCADRILL(530,"excadrill","stalobor"),
    AUDINO(531,"audino","ohrdoch","mega"),
    TIMBURR(532,"timburr","praktibalk"),
    GURDURR(533,"gurdurr","strepoli"),
    CONKELDURR(534,"conkeldurr","meistagrif"),
    TYMPOLE(535,"tympole","schallquap"),
    PALPITOAD(536,"palpitoad","mebrana"),
    SEISMITOAD(537,"seismitoad","branawarz"),
    THROH(538,"throh","jiutesto"),
    SAWK(539,"sawk","karadonis"),
    SEWADDLE(540,"sewaddle","strawickl"),
    SWADLOON(541,"swadloon","folikon"),
    LEAVANNY(542,"leavanny","matrifol"),
    VENIPEDE(543,"venipede","toxiped"),
    WHIRLIPEDE(544,"whirlipede","rollum"),
    SCOLIPEDE(545,"scolipede","cerapendra"),
    COTTONEE(546,"cottonee","waumboll"),
    WHIMSICOTT(547,"whimsicott","elfun"),
    PETILIL(548,"petilil","lilminip"),
    LILLIGANT(549,"lilligant","dressella"),
    BASCULIN(550,"basculin","barschuft","redstriped","bluestriped"),
    SANDILE(551,"sandile","ganovil"),
    KROKOROK(552,"krokorok","rokkaiman"),
    KROOKODILE(553,"krookodile","rabigator"),
    DARUMAKA(554,"darumaka","flampion","galar"),
    DARMANITAN(555,"darmanitan","flampivian","standard","zen","standardgalar","zengalar"),
    MARACTUS(556,"maractus","maracamba"),
    DWEBBLE(557,"dwebble","lithomith"),
    CRUSTLE(558,"crustle","castellith"),
    SCRAGGY(559,"scraggy","zurrokex"),
    SCRAFTY(560,"scrafty","irokex"),
    SIGILYPH(561,"sigilyph","symvolara"),
    YAMASK(562,"yamask","makabaja","galar"),
    COFAGRIGUS(563,"cofagrigus","echnatoll"),
    TIRTOUGA(564,"tirtouga","galapaflos"),
    CARRACOSTA(565,"carracosta","karippas"),
    ARCHEN(566,"archen","flapteryx"),
    ARCHEOPS(567,"archeops","aeropteryx"),
    TRUBBISH(568,"trubbish","unratütox"),
    GARBODOR(569,"garbodor","deponitox","gmax"),
    ZORUA(570,"zorua","zorua"),
    ZOROARK(571,"zoroark","zoroark"),
    MINCCINO(572,"minccino","picochilla"),
    CINCCINO(573,"cinccino","chillabell"),
    GOTHITA(574,"gothita","mollimorba"),
    GOTHORITA(575,"gothorita","hypnomorba"),
    GOTHITELLE(576,"gothitelle","morbitesse"),
    SOLOSIS(577,"solosis","monozyto"),
    DUOSION(578,"duosion","mitodos"),
    REUNICLUS(579,"reuniclus","zytomega"),
    DUCKLETT(580,"ducklett","piccolente"),
    SWANNA(581,"swanna","swaroness"),
    VANILLITE(582,"vanillite","gelatini"),
    VANILLISH(583,"vanillish","gelatroppo"),
    VANILLUXE(584,"vanilluxe","gelatwino"),
    DEERLING(585,"deerling","sesokitz"),
    SAWSBUCK(586,"sawsbuck","kronjuwild"),
    EMOLGA(587,"emolga","emolga"),
    KARRABLAST(588,"karrablast","laukaps"),
    ESCAVALIER(589,"escavalier","cavalanzas"),
    FOONGUS(590,"foongus","tarnpignon"),
    AMOONGUSS(591,"amoonguss","hutsassa"),
    FRILLISH(592,"frillish","quabbel"),
    JELLICENT(593,"jellicent","apoquallyp"),
    ALOMOMOLA(594,"alomomola","mamolida"),
    JOLTIK(595,"joltik","wattzapf"),
    GALVANTULA(596,"galvantula","voltula"),
    FERROSEED(597,"ferroseed","kastadur"),
    FERROTHORN(598,"ferrothorn","tentantel"),
    KLINK(599,"klink","klikk"),
    KLANG(600,"klang","kliklak"),
    KLINKLANG(601,"klinklang","klikdiklak"),
    TYNAMO(602,"tynamo","zapplardin"),
    EELEKTRIK(603,"eelektrik","zapplalek"),
    EELEKTROSS(604,"eelektross","zapplarang"),
    ELGYEM(605,"elgyem","pygraulon"),
    BEHEEYEM(606,"beheeyem","megalon"),
    LITWICK(607,"litwick","lichtel"),
    LAMPENT(608,"lampent","laternecto"),
    CHANDELURE(609,"chandelure","skelabra"),
    AXEW(610,"axew","milza"),
    FRAXURE(611,"fraxure","sharfax"),
    HAXORUS(612,"haxorus","maxax"),
    CUBCHOO(613,"cubchoo","petznief"),
    BEARTIC(614,"beartic","siberio"),
    CRYOGONAL(615,"cryogonal","frigometri"),
    SHELMET(616,"shelmet","schnuthelm"),
    ACCELGOR(617,"accelgor","hydragil"),
    STUNFISK(618,"stunfisk","flunschlik","galar"),
    MIENFOO(619,"mienfoo","lin-fu"),
    MIENSHAO(620,"mienshao","wie-shu"),
    DRUDDIGON(621,"druddigon","shardrago"),
    GOLETT(622,"golett","golbit"),
    GOLURK(623,"golurk","golgantes"),
    PAWNIARD(624,"pawniard","gladiantri"),
    BISHARP(625,"bisharp","caesurio"),
    BOUFFALANT(626,"bouffalant","bisofank"),
    RUFFLET(627,"rufflet","geronimatz"),
    BRAVIARY(628,"braviary","washakwil"),
    VULLABY(629,"vullaby","skallyk"),
    MANDIBUZZ(630,"mandibuzz","grypheldis"),
    HEATMOR(631,"heatmor","furnifraß"),
    DURANT(632,"durant","fermicula"),
    DEINO(633,"deino","kapuno"),
    ZWEILOUS(634,"zweilous","duodino"),
    HYDREIGON(635,"hydreigon","trikephalo"),
    LARVESTA(636,"larvesta","ignivor"),
    VOLCARONA(637,"volcarona","ramoth"),
    COBALION(638,"cobalion","kobalium"),
    TERRAKION(639,"terrakion","terrakium"),
    VIRIZION(640,"virizion","viridium"),
    TORNADUS(641,"tornadus","boreos","incarnate","therian"),
    THUNDURUS(642,"thundurus","voltolos","incarnate","therian"),
    RESHIRAM(643,"reshiram","reshiram"),
    ZEKROM(644,"zekrom","zekrom"),
    LANDORUS(645,"landorus","demeteros","incarnate","therian"),
    KYUREM(646,"kyurem","kyurem","black","white"),
    KELDEO(647,"keldeo","keldeo","ordinary","resolute"),
    MELOETTA(648,"meloetta","meloetta","aria","pirouette"),
    GENESECT(649,"genesect","genesect"),
    CHESPIN(650,"chespin","igamaro"),
    QUILLADIN(651,"quilladin","igastarnish"),
    CHESNAUGHT(652,"chesnaught","brigaron"),
    FENNEKIN(653,"fennekin","fynx"),
    BRAIXEN(654,"braixen","rutena"),
    DELPHOX(655,"delphox","fennexis"),
    FROAKIE(656,"froakie","froxy"),
    FROGADIER(657,"frogadier","amphizel"),
    GRENINJA(658,"greninja","quajutsu","battlebond","ash"),
    BUNNELBY(659,"bunnelby","scoppel"),
    DIGGERSBY(660,"diggersby","grebbit"),
    FLETCHLING(661,"fletchling","dartiri"),
    FLETCHINDER(662,"fletchinder","dartignis"),
    TALONFLAME(663,"talonflame","fiaro"),
    SCATTERBUG(664,"scatterbug","purmel"),
    SPEWPA(665,"spewpa","puponcho"),
    VIVILLON(666,"vivillon","vivillon"),
    LITLEO(667,"litleo","leufeo"),
    PYROAR(668,"pyroar","pyroleo"),
    FLABEBE(669,"flabebe","flabébé"),
    FLOETTE(670,"floette","floette","eternal"),
    FLORGES(671,"florges","florges"),
    SKIDDO(672,"skiddo","mähikel"),
    GOGOAT(673,"gogoat","chevrumm"),
    PANCHAM(674,"pancham","pam-pam"),
    PANGORO(675,"pangoro","pandagro"),
    FURFROU(676,"furfrou","coiffwaff"),
    ESPURR(677,"espurr","psiau"),
    MEOWSTIC(678,"meowstic","psiaugon","male","female"),
    HONEDGE(679,"honedge","gramokles"),
    DOUBLADE(680,"doublade","duokles"),
    AEGISLASH(681,"aegislash","durengard","shield","blade"),
    SPRITZEE(682,"spritzee","parfi"),
    AROMATISSE(683,"aromatisse","parfinesse"),
    SWIRLIX(684,"swirlix","flauschling"),
    SLURPUFF(685,"slurpuff","sabbaione"),
    INKAY(686,"inkay","iscalar"),
    MALAMAR(687,"malamar","calamanero"),
    BINACLE(688,"binacle","bithora"),
    BARBARACLE(689,"barbaracle","thanathora"),
    SKRELP(690,"skrelp","algitt"),
    DRAGALGE(691,"dragalge","tandrak"),
    CLAUNCHER(692,"clauncher","scampisto"),
    CLAWITZER(693,"clawitzer","wummer"),
    HELIOPTILE(694,"helioptile","eguana"),
    HELIOLISK(695,"heliolisk","elezard"),
    TYRUNT(696,"tyrunt","balgoras"),
    TYRANTRUM(697,"tyrantrum","monargoras"),
    AMAURA(698,"amaura","amarino"),
    AURORUS(699,"aurorus","amagarga"),
    SYLVEON(700,"sylveon","feelinara"),
    HAWLUCHA(701,"hawlucha","resladero"),
    DEDENNE(702,"dedenne","dedenne"),
    CARBINK(703,"carbink","rocara"),
    GOOMY(704,"goomy","viscora"),
    SLIGGOO(705,"sliggoo","viscargot"),
    GOODRA(706,"goodra","viscogon"),
    KLEFKI(707,"klefki","clavion"),
    PHANTUMP(708,"phantump","paragoni"),
    TREVENANT(709,"trevenant","trombork"),
    PUMPKABOO(710,"pumpkaboo","irrbis","average","small","large","super"),
    GOURGEIST(711,"gourgeist","pumpdjinn","average","small","large","super"),
    BERGMITE(712,"bergmite","arktip"),
    AVALUGG(713,"avalugg","arktilas"),
    NOIBAT(714,"noibat","ef-em"),
    NOIVERN(715,"noivern","uhafnir"),
    XERNEAS(716,"xerneas","xerneas"),
    YVELTAL(717,"yveltal","yveltal"),
    ZYGARDE(718,"zygarde","zygarde","10","50","complete"),
    DIANCIE(719,"diancie","diancie","mega"),
    HOOPA(720,"hoopa","hoopa","unbound"),
    VOLCANION(721,"volcanion","volcanion"),
    ROWLET(722,"rowlet","bauz"),
    DARTRIX(723,"dartrix","arboretoss"),
    DECIDUEYE(724,"decidueye","silvarro"),
    LITTEN(725,"litten","flamiau"),
    TORRACAT(726,"torracat","miezunder"),
    INCINEROAR(727,"incineroar","fuegro"),
    POPPLIO(728,"popplio","robball"),
    BRIONNE(729,"brionne","marikeck"),
    PRIMARINA(730,"primarina","primarene"),
    PIKIPEK(731,"pikipek","peppeck"),
    TRUMBEAK(732,"trumbeak","trompeck"),
    TOUCANNON(733,"toucannon","tukanon"),
    YUNGOOS(734,"yungoos","mangunior"),
    GUMSHOOS(735,"gumshoos","manguspektor","totem"),
    GRUBBIN(736,"grubbin","mabula"),
    CHARJABUG(737,"charjabug","akkup"),
    VIKAVOLT(738,"vikavolt","donarion","totem"),
    CRABRAWLER(739,"crabrawler","krabbox"),
    CRABOMINABLE(740,"crabominable","krawell"),
    ORICORIO(741,"oricorio","choreogel","baile","pompom","pau","sensu"),
    CUTIEFLY(742,"cutiefly","wommel"),
    RIBOMBEE(743,"ribombee","bandelby","totem"),
    ROCKRUFF(744,"rockruff","wuffels","owntempo"),
    LYCANROC(745,"lycanroc","wolwerock","midday","midnight","dusk"),
    WISHIWASHI(746,"wishiwashi","lusardin","solo","school"),
    MAREANIE(747,"mareanie","garstella"),
    TOXAPEX(748,"toxapex","aggrostella"),
    MUDBRAY(749,"mudbray","pampuli"),
    MUDSDALE(750,"mudsdale","pampross"),
    DEWPIDER(751,"dewpider","araqua"),
    ARAQUANID(752,"araquanid","aranestro","totem"),
    FOMANTIS(753,"fomantis","imantis"),
    LURANTIS(754,"lurantis","mantidea","totem"),
    MORELULL(755,"morelull","bubungus"),
    SHIINOTIC(756,"shiinotic","lamellux"),
    SALANDIT(757,"salandit","molunk"),
    SALAZZLE(758,"salazzle","amfira","totem"),
    STUFFUL(759,"stufful","velursi"),
    BEWEAR(760,"bewear","kosturso"),
    BOUNSWEET(761,"bounsweet","frubberl"),
    STEENEE(762,"steenee","frubaila"),
    TSAREENA(763,"tsareena","fruyal"),
    COMFEY(764,"comfey","curelei"),
    ORANGURU(765,"oranguru","kommandutan"),
    PASSIMIAN(766,"passimian","quartermak"),
    WIMPOD(767,"wimpod","reißlaus"),
    GOLISOPOD(768,"golisopod","tectass"),
    SANDYGAST(769,"sandygast","sankabuh"),
    PALOSSAND(770,"palossand","colossand"),
    PYUKUMUKU(771,"pyukumuku","gufa"),
    TYPE_NULL(772,"type-null","typ:null"),
    SILVALLY(773,"silvally","amigento"),
    MINIOR(774,"minior","meteno","redmeteor","orangemeteor","yellowmeteor","greenmeteor","bluemeteor","indigometeor","violetmeteor","red","orange","yellow","green","blue","indigo","violet"),
    KOMALA(775,"komala","koalelu"),
    TURTONATOR(776,"turtonator","tortunator"),
    TOGEDEMARU(777,"togedemaru","togedemaru","totem"),
    MIMIKYU(778,"mimikyu","mimigma","disguised","busted","totemdisguised","totembusted"),
    BRUXISH(779,"bruxish","knirfish"),
    DRAMPA(780,"drampa","sen-long"),
    DHELMISE(781,"dhelmise","moruda"),
    JANGMO_O(782,"jangmo-o","miniras"),
    HAKAMO_O(783,"hakamo-o","mediras"),
    KOMMO_O(784,"kommo-o","grandiras"),
    TAPU_KOKO(785,"tapu-koko","kapu-riki"),
    TAPU_LELE(786,"tapu-lele","kapu-fala"),
    TAPU_BULU(787,"tapu-bulu","kapu-toro"),
    TAPU_FINI(788,"tapu-fini","kapu-kime"),
    COSMOG(789,"cosmog","cosmog"),
    COSMOEM(790,"cosmoem","cosmovum"),
    SOLGALEO(791,"solgaleo","solgaleo"),
    LUNALA(792,"lunala","lunala"),
    NIHILEGO(793,"nihilego","anego"),
    BUZZWOLE(794,"buzzwole","masskito"),
    PHEROMOSA(795,"pheromosa","schabelle"),
    XURKITREE(796,"xurkitree","voltriant"),
    CELESTEELA(797,"celesteela","kaguron"),
    KARTANA(798,"kartana","katagami"),
    GUZZLORD(799,"guzzlord","schlingking"),
    NECROZMA(800,"necrozma","necrozma","dusk","dawn","ultra"),
    MAGEARNA(801,"magearna","magearna","original"),
    MARSHADOW(802,"marshadow","marshadow"),
    POIPOLE(803,"poipole","venicro"),
    NAGANADEL(804,"naganadel","agoyon"),
    STAKATAKA(805,"stakataka","muramura"),
    BLACEPHALON(806,"blacephalon","kopplosio"),
    ZERAORA(807,"zeraora","zeraora"),
    MELTAN(808,"meltan","meltan"),
    MELMETAL(809,"melmetal","melmetal","gmax"),
    GROOKEY(810,"grookey","chimpep"),
    THWACKEY(811,"thwackey","chimstix"),
    RILLABOOM(812,"rillaboom","gortrom","gmax"),
    SCORBUNNY(813,"scorbunny","hopplo"),
    RABOOT(814,"raboot","kickerlo"),
    CINDERACE(815,"cinderace","liberlo","gmax"),
    SOBBLE(816,"sobble","memmeon"),
    DRIZZILE(817,"drizzile","phlegleon"),
    INTELEON(818,"inteleon","intelleon","gmax"),
    SKWOVET(819,"skwovet","raffel"),
    GREEDENT(820,"greedent","schlaraffel"),
    ROOKIDEE(821,"rookidee","meikro"),
    CORVISQUIRE(822,"corvisquire","kranoviz"),
    CORVIKNIGHT(823,"corviknight","krarmor","gmax"),
    BLIPBUG(824,"blipbug","sensect"),
    DOTTLER(825,"dottler","keradar"),
    ORBEETLE(826,"orbeetle","maritellit","gmax"),
    NICKIT(827,"nickit","kleptifux"),
    THIEVUL(828,"thievul","gaunux"),
    GOSSIFLEUR(829,"gossifleur","cottini"),
    ELDEGOSS(830,"eldegoss","cottomi"),
    WOOLOO(831,"wooloo","wolly"),
    DUBWOOL(832,"dubwool","zwollock"),
    CHEWTLE(833,"chewtle","kamehaps"),
    DREDNAW(834,"drednaw","kamalm","gmax"),
    YAMPER(835,"yamper","voldi"),
    BOLTUND(836,"boltund","bellektro"),
    ROLYCOLY(837,"rolycoly","klonkett"),
    CARKOL(838,"carkol","wagong"),
    COALOSSAL(839,"coalossal","montecarbo","gmax"),
    APPLIN(840,"applin","knapfel"),
    FLAPPLE(841,"flapple","drapfel","gmax"),
    APPLETUN(842,"appletun","schlapfel","gmax"),
    SILICOBRA(843,"silicobra","salanga"),
    SANDACONDA(844,"sandaconda","sanaconda","gmax"),
    CRAMORANT(845,"cramorant","urgl"),
    ARROKUDA(846,"arrokuda","pikuda"),
    BARRASKEWDA(847,"barraskewda","barrakiefa"),
    TOXEL(848,"toxel","toxel"),
    TOXTRICITY(849,"toxtricity","riffex","amped","lowkey","ampedgmax","lowkeygmax"),
    SIZZLIPEDE(850,"sizzlipede","thermopod"),
    CENTISKORCH(851,"centiskorch","infernopod","gmax"),
    CLOBBOPUS(852,"clobbopus","klopptopus"),
    GRAPPLOCT(853,"grapploct","kaocto"),
    SINISTEA(854,"sinistea","fatalitee"),
    POLTEAGEIST(855,"polteageist","mortipot"),
    HATENNA(856,"hatenna","brimova"),
    HATTREM(857,"hattrem","brimano"),
    HATTERENE(858,"hatterene","silembrim","gmax"),
    IMPIDIMP(859,"impidimp","bähmon"),
    MORGREM(860,"morgrem","pelzebub"),
    GRIMMSNARL(861,"grimmsnarl","olangaa","gmax"),
    OBSTAGOON(862,"obstagoon","barrikadax"),
    PERRSERKER(863,"perrserker","mauzinger"),
    CURSOLA(864,"cursola","gorgasonn"),
    SIRFETCHD(865,"sirfetchd","lauchzelot"),
    MR_RIME(866,"mr-rime","pantifrost"),
    RUNERIGUS(867,"runerigus","oghnatoll"),
    MILCERY(868,"milcery","hokumil"),
    ALCREMIE(869,"alcremie","pokusan","gmax"),
    FALINKS(870,"falinks","legios"),
    PINCURCHIN(871,"pincurchin","britzigel"),
    SNOM(872,"snom","snomnom"),
    FROSMOTH(873,"frosmoth","mottineva"),
    STONJOURNER(874,"stonjourner","humanolith"),
    EISCUE(875,"eiscue","kubuin","ice","noice"),
    INDEEDEE(876,"indeedee","servol","male","female"),
    MORPEKO(877,"morpeko","morpeko"),
    CUFANT(878,"cufant","kupfanti"),
    COPPERAJAH(879,"copperajah","patinaraja","gmax"),
    DRACOZOLT(880,"dracozolt","lectragon"),
    ARCTOZOLT(881,"arctozolt","lecryodon"),
    DRACOVISH(882,"dracovish","pescragon"),
    ARCTOVISH(883,"arctovish","pescryodon"),
    DURALUDON(884,"duraludon","duraludon","gmax"),
    DREEPY(885,"dreepy","grolldra"),
    DRAKLOAK(886,"drakloak","phandra"),
    DRAGAPULT(887,"dragapult","katapuldra"),
    ZACIAN(888,"zacian","zacian","hero","crowned"),
    ZAMAZENTA(889,"zamazenta","zamazenta","hero","crowned"),
    ETERNATUS(890,"eternatus","endynalos","eternamax"),
    KUBFU(891,"kubfu","dakuma"),
    URSHIFU(892,"urshifu","wulaosu","singlestrike","rapidstrike","singlestrikegmax","rapidstrikegmax"),
    ZARUDE(893,"zarude","zarude"),
    REGIELEKI(894,"regieleki","regieleki"),
    REGIDRAGO(895,"regidrago","regidrago"),
    GLASTRIER(896,"glastrier","polaross"),
    SPECTRIER(897,"spectrier","phantoross"),
    CALYREX(898,"calyrex","coronospa","icerider","shadowrider");

    @Getter
    private int id;

    @Getter
    private String name;

    @Getter
    private String nameDe;

    @Getter
    private String[] form;

    private PokemonEnum(int id, String name, String nameDe, String... form)
    {
        this.id = id;
        this.name = name;
        this.nameDe = nameDe;
        this.form = form;
    }

    public static PokemonEnum getPokemonByID(int id)
    {
        for(PokemonEnum pkm: PokemonEnum.values())
            if(pkm.id == id)
                return pkm;

        return null;
    }

    public static PokemonEnum getPokemonByName(String name)
    {
        for(PokemonEnum pkm: PokemonEnum.values())
            if(pkm.name.equalsIgnoreCase(name))
                return pkm;

        return null;
    }

    public static PokemonEnum getPokemonByNameDe(String name)
    {
        for(PokemonEnum pkm: PokemonEnum.values())
            if(pkm.nameDe.equalsIgnoreCase(name))
                return pkm;

        return null;
    }

    public static PokemonEnum[] getPokemonThatContains(String name)
    {
        LinkedList<PokemonEnum> pokis = new LinkedList();
        for(PokemonEnum pkm : values())
        {
            pokis.add(pkm);
        }

        return pokis.stream().filter(p -> p.getName().contains(name.toLowerCase(Locale.ROOT)) || p.getNameDe().contains(name.toLowerCase(Locale.ROOT))).toArray(PokemonEnum[]::new);
    }

    public String toString()
    {
        return String.format("#%03d ",id)+AmIUtils.toFancyString(name)+"/"+AmIUtils.toFancyString(nameDe);
    }
}