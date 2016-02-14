package com.example.agustin.sunshine.presentacionLayer.model;

import android.net.Uri;

/**
 * Created by agustin on 31/08/15.
 */
public final class WeatherApi {
    private final static String API_KEY="f14ab4c89826c33513b4318914c62071";
    private final static String CITY_NAME="Buenos Aires, AR";
    private final static String BSAS_LONG= "-58.377232";
    private final static String BSAS_LAT="-34.613152 ";
    private final static String BSAS_ID="3435910";
    private final static String API_CMD="APPID";
    private final static int  FORECAST_DAYS= 7;
    private final static String WEATHER_REQUEST ="http://api.openweathermap.org/data/2.5/forecast/daily?units=metric";

    public static String getGetRequest() {
        return GET_REQUEST;
    }

    public static String getSelectedForecast() {
        return SELECTED_FORECAST;
    }

    /**
     * common constants
     */
    private final static String GET_REQUEST="GET";
    private final static String SELECTED_FORECAST="selectedForecast";

    /*{"_id":3427273,"name":"Yataity Calle","country":"AR","coord":{"lon":-58.908459,"lat":-29.019131}}
{"_id":3427279,"name":"Yapeyu","country":"AR","coord":{"lon":-56.818409,"lat":-29.469139}}
{"_id":3427404,"name":"Villa Mantero","country":"AR","coord":{"lon":-58.74596,"lat":-32.39727}}
{"_id":3427420,"name":"Villa Hernandarias","country":"AR","coord":{"lon":-59.985001,"lat":-31.23101}}
{"_id":3427439,"name":"Villa Escolar","country":"AR","coord":{"lon":-58.671341,"lat":-26.622089}}
{"_id":3427443,"name":"Villa Elisa","country":"AR","coord":{"lon":-58.400822,"lat":-32.1632}}
{"_id":3427535,"name":"Departamento de Veinticinco de Mayo","country":"AR","coord":{"lon":-54.666672,"lat":-27.41667}}
{"_id":3427537,"name":"Veinticinco de Mayo","country":"AR","coord":{"lon":-54.743118,"lat":-27.376789}}
{"_id":3427593,"name":"Ubajay","country":"AR","coord":{"lon":-58.313499,"lat":-31.793579}}
{"_id":3427659,"name":"Tres Capones","country":"AR","coord":{"lon":-55.60471,"lat":-28.006411}}
{"_id":3427885,"name":"Tabossi","country":"AR","coord":{"lon":-59.934769,"lat":-31.80135}}
{"_id":3427994,"name":"Sauce de Luna","country":"AR","coord":{"lon":-59.218719,"lat":-31.23794}}
{"_id":3428079,"name":"Santo Pipo","country":"AR","coord":{"lon":-55.408669,"lat":-27.141319}}
{"_id":3428182,"name":"Santa Rosa","country":"AR","coord":{"lon":-58.118912,"lat":-28.26318}}
{"_id":3428264,"name":"Santa Maria","country":"AR","coord":{"lon":-55.38541,"lat":-27.903561}}
{"_id":3428424,"name":"Santa Anita","country":"AR","coord":{"lon":-58.786221,"lat":-32.174759}}
{"_id":3428453,"name":"Santa Ana","country":"AR","coord":{"lon":-57.931622,"lat":-30.90004}}
{"_id":3428638,"name":"Departamento de San Miguel","country":"AR","coord":{"lon":-57.5,"lat":-27.91667}}
{"_id":3428644,"name":"San Miguel","country":"AR","coord":{"lon":-57.589642,"lat":-27.99585}}
{"_id":3428776,"name":"San Justo","country":"AR","coord":{"lon":-58.435692,"lat":-32.446541}}
{"_id":3428928,"name":"San Jose","country":"AR","coord":{"lon":-55.7826,"lat":-27.769791}}
{"_id":3429054,"name":"San Francisco de Laishi","country":"AR","coord":{"lon":-58.63039,"lat":-26.24262}}
{"_id":3429210,"name":"San Carlos","country":"AR","coord":{"lon":-55.897301,"lat":-27.745859}}
{"_id":3429426,"name":"Ruiz de Montoya","country":"AR","coord":{"lon":-55.049999,"lat":-26.98333}}
{"_id":3429560,"name":"Riachuelo","country":"AR","coord":{"lon":-58.739449,"lat":-27.577539}}
{"_id":3429710,"name":"Puerto Yerua","country":"AR","coord":{"lon":-58.01527,"lat":-31.53713}}
{"_id":3429764,"name":"Puerto Libertad","country":"AR","coord":{"lon":-54.620892,"lat":-25.91641}}
{"_id":3429765,"name":"Puerto Leoni","country":"AR","coord":{"lon":-55.165699,"lat":-26.96069}}
{"_id":3429820,"name":"Pueblo Libertador","country":"AR","coord":{"lon":-59.389809,"lat":-30.220869}}
{"_id":3429843,"name":"Pronunciamiento","country":"AR","coord":{"lon":-58.432869,"lat":-32.346169}}
{"_id":3429864,"name":"Presidencia Roca","country":"AR","coord":{"lon":-59.595409,"lat":-26.1409}}
{"_id":3429971,"name":"Pinamar","country":"AR","coord":{"lon":-56.861401,"lat":-37.107941}}
{"_id":3429996,"name":"Piedras Blancas","country":"AR","coord":{"lon":-59.959572,"lat":-31.18623}}
{"_id":3430029,"name":"Perugorria","country":"AR","coord":{"lon":-58.610592,"lat":-29.34132}}
{"_id":3430064,"name":"Pedro R. Fernandez","country":"AR","coord":{"lon":-58.65583,"lat":-28.750971}}
{"_id":3430105,"name":"Paso de la Patria","country":"AR","coord":{"lon":-58.571972,"lat":-27.316759}}
{"_id":3430182,"name":"Pampa Almiron","country":"AR","coord":{"lon":-59.133331,"lat":-26.700001}}
{"_id":3430186,"name":"Palo Santo","country":"AR","coord":{"lon":-59.337811,"lat":-25.56332}}
{"_id":3430219,"name":"Palmar Grande","country":"AR","coord":{"lon":-57.90057,"lat":-27.94195}}
{"_id":3430383,"name":"Nueve de Julio","country":"AR","coord":{"lon":-58.8265,"lat":-28.840509}}
{"_id":3430402,"name":"Nuestra Senora del Rosario de Caa Cati","country":"AR","coord":{"lon":-57.620731,"lat":-27.750719}}
{"_id":3430631,"name":"Mojon Grande","country":"AR","coord":{"lon":-55.156311,"lat":-27.711639}}
{"_id":3430759,"name":"Departamento de MburucuyÃ¡","country":"AR","coord":{"lon":-58.25,"lat":-28}}
{"_id":3430760,"name":"Mburucuya","country":"AR","coord":{"lon":-58.224491,"lat":-28.045389}}
{"_id":3430798,"name":"Martires","country":"AR","coord":{"lon":-55.383331,"lat":-27.433331}}
{"_id":3430836,"name":"Mariano I. Loza","country":"AR","coord":{"lon":-58.194359,"lat":-29.37668}}
{"_id":3431161,"name":"Los Helechos","country":"AR","coord":{"lon":-55.076832,"lat":-27.5576}}
{"_id":3431184,"name":"Los Conquistadores","country":"AR","coord":{"lon":-58.467731,"lat":-30.590799}}
{"_id":3431188,"name":"Los Charruas","country":"AR","coord":{"lon":-58.18774,"lat":-31.17548}}
{"_id":3431244,"name":"Loreto","country":"AR","coord":{"lon":-57.275311,"lat":-27.768339}}
{"_id":3431245,"name":"Loreto","country":"AR","coord":{"lon":-55.522251,"lat":-27.336349}}
{"_id":3431272,"name":"Lomas de Vallejos","country":"AR","coord":{"lon":-57.918499,"lat":-27.73501}}
{"_id":3431367,"name":"Libertad","country":"AR","coord":{"lon":-57.820202,"lat":-30.042999}}
{"_id":3431460,"name":"La Verde","country":"AR","coord":{"lon":-59.37352,"lat":-27.126341}}
{"_id":3431777,"name":"Las Garcitas","country":"AR","coord":{"lon":-59.799999,"lat":-26.58333}}
{"_id":3431916,"name":"Larroque","country":"AR","coord":{"lon":-59.001251,"lat":-33.03595}}
{"_id":3432122,"name":"Lapachito","country":"AR","coord":{"lon":-59.38604,"lat":-27.159981}}
{"_id":3432463,"name":"Laguna Naick-Neck","country":"AR","coord":{"lon":-58.09383,"lat":-25.24769}}
{"_id":3432466,"name":"Laguna Limpia","country":"AR","coord":{"lon":-59.680828,"lat":-26.495649}}
{"_id":3432653,"name":"La Escondida","country":"AR","coord":{"lon":-59.447842,"lat":-27.107241}}
{"_id":3432707,"name":"La Eduvigis","country":"AR","coord":{"lon":-59.06842,"lat":-26.85545}}
{"_id":3432760,"name":"La Cruz","country":"AR","coord":{"lon":-56.643261,"lat":-29.174431}}
{"_id":3432768,"name":"La Criolla","country":"AR","coord":{"lon":-58.105579,"lat":-31.269039}}
{"_id":3433291,"name":"Juan Pujol","country":"AR","coord":{"lon":-57.856121,"lat":-30.41873}}
{"_id":3433373,"name":"Ita Ibate","country":"AR","coord":{"lon":-57.337582,"lat":-27.42573}}
{"_id":3433513,"name":"Ibarreta","country":"AR","coord":{"lon":-59.858509,"lat":-25.21438}}
{"_id":3433567,"name":"Herradura","country":"AR","coord":{"lon":-58.311981,"lat":-26.487049}}
{"_id":3433575,"name":"Herlitzka","country":"AR","coord":{"lon":-58.255569,"lat":-27.565161}}
{"_id":3433743,"name":"Gobernador Roca","country":"AR","coord":{"lon":-55.464329,"lat":-27.186359}}
{"_id":3433747,"name":"Gobernador Mansilla","country":"AR","coord":{"lon":-59.354801,"lat":-32.544529}}
{"_id":3433751,"name":"Gobernador Juan E. Martinez","country":"AR","coord":{"lon":-58.932919,"lat":-28.917049}}
{"_id":3433773,"name":"General Vedia","country":"AR","coord":{"lon":-58.6604,"lat":-26.933821}}
{"_id":3433809,"name":"General Galarza","country":"AR","coord":{"lon":-59.396149,"lat":-32.720341}}
{"_id":3433815,"name":"General Campos","country":"AR","coord":{"lon":-58.4049,"lat":-31.523109}}
{"_id":3433820,"name":"General Alvear","country":"AR","coord":{"lon":-55.166672,"lat":-27.433331}}
{"_id":3433839,"name":"Garuhape","country":"AR","coord":{"lon":-54.956638,"lat":-26.81768}}
{"_id":3433842,"name":"Garruchos","country":"AR","coord":{"lon":-55.639469,"lat":-28.185141}}
{"_id":3433919,"name":"Florentino Ameghino","country":"AR","coord":{"lon":-55.133331,"lat":-27.566669}}
{"_id":3433944,"name":"Felipe Yofre","country":"AR","coord":{"lon":-58.337719,"lat":-29.102261}}
{"_id":3434932,"name":"El Alcazar","country":"AR","coord":{"lon":-54.815231,"lat":-26.71459}}
{"_id":3434995,"name":"Dos de Mayo","country":"AR","coord":{"lon":-54.686691,"lat":-27.02277}}
{"_id":3434997,"name":"Dos Arroyos","country":"AR","coord":{"lon":-55.233639,"lat":-27.70784}}
{"_id":3435030,"name":"Dominguez","country":"AR","coord":{"lon":-58.961971,"lat":-31.987101}}
{"_id":3435178,"name":"Cruz de los Milagros","country":"AR","coord":{"lon":-59.004761,"lat":-28.83646}}
{"_id":3435196,"name":"Cote-Lai","country":"AR","coord":{"lon":-59.599998,"lat":-27.5}}
{"_id":3435258,"name":"Conscripto Bernardi","country":"AR","coord":{"lon":-59.084351,"lat":-31.04837}}
{"_id":3435269,"name":"Departamento de ConcepciÃ³n","country":"AR","coord":{"lon":-58,"lat":-28.33333}}
{"_id":3435273,"name":"Concepcion","country":"AR","coord":{"lon":-57.887772,"lat":-28.39175}}
{"_id":3435283,"name":"Comandante Fontana","country":"AR","coord":{"lon":-59.682121,"lat":-25.33453}}
{"_id":3435290,"name":"Colonia Wanda","country":"AR","coord":{"lon":-54.428059,"lat":-25.974079}}
{"_id":3435295,"name":"Colonias Unidas","country":"AR","coord":{"lon":-59.631538,"lat":-26.69825}}
{"_id":3435330,"name":"Colonia Elisa","country":"AR","coord":{"lon":-59.518608,"lat":-26.93041}}
{"_id":3435331,"name":"Colonia Elia","country":"AR","coord":{"lon":-58.32148,"lat":-32.666248}}
{"_id":3435344,"name":"Colonia Aurora","country":"AR","coord":{"lon":-54.524979,"lat":-27.474279}}
{"_id":3435399,"name":"Ciervo Petiso","country":"AR","coord":{"lon":-59.630939,"lat":-26.58041}}
{"_id":3435444,"name":"Chavarria","country":"AR","coord":{"lon":-58.572769,"lat":-28.95488}}
{"_id":3435453,"name":"Charadai","country":"AR","coord":{"lon":-59.900002,"lat":-27.633329}}
{"_id":3435570,"name":"Ceibas","country":"AR","coord":{"lon":-58.75,"lat":-33.433331}}
{"_id":3435612,"name":"Caseros","country":"AR","coord":{"lon":-58.478722,"lat":-32.463249}}
{"_id":3435679,"name":"Caraguatay","country":"AR","coord":{"lon":-54.78093,"lat":-26.605869}}
{"_id":3435688,"name":"Capitan Solari","country":"AR","coord":{"lon":-59.56089,"lat":-26.802151}}
{"_id":3435701,"name":"Capiovi","country":"AR","coord":{"lon":-55.060841,"lat":-26.929979}}
{"_id":3435789,"name":"Campo Grande","country":"AR","coord":{"lon":-54.979771,"lat":-27.207701}}
{"_id":3435988,"name":"Bonpland","country":"AR","coord":{"lon":-57.431461,"lat":-29.823971}}
{"_id":3435989,"name":"Bonpland","country":"AR","coord":{"lon":-55.477558,"lat":-27.48218}}
{"_id":3436100,"name":"Basail","country":"AR","coord":{"lon":-59.299999,"lat":-27.866671}}
{"_id":3436205,"name":"Azara","country":"AR","coord":{"lon":-55.677971,"lat":-28.0616}}
{"_id":3436267,"name":"Arroyo del Medio","country":"AR","coord":{"lon":-55.416672,"lat":-27.700001}}
{"_id":3436370,"name":"Alvear","country":"AR","coord":{"lon":-56.55043,"lat":-29.09683}}
{"_id":3436398,"name":"Almafuerte","country":"AR","coord":{"lon":-55.39497,"lat":-27.50518}}
{"_id":3436433,"name":"Aldea San Antonio","country":"AR","coord":{"lon":-58.703331,"lat":-32.62376}}
{"_id":3436448,"name":"Alba Posse","country":"AR","coord":{"lon":-54.682621,"lat":-27.56978}}
{"_id":3480740,"name":"Guernica","country":"AR","coord":{"lon":-58.38694,"lat":-34.917221}}
{"_id":3832189,"name":"Yuto","country":"AR","coord":{"lon":-64.471939,"lat":-23.643419}}
{"_id":3832398,"name":"Wenceslao Escalante","country":"AR","coord":{"lon":-62.770779,"lat":-33.173031}}
{"_id":3832518,"name":"Vista Alegre","country":"AR","coord":{"lon":-68.183327,"lat":-38.75}}
{"_id":3832560,"name":"Vinchina","country":"AR","coord":{"lon":-68.206917,"lat":-28.75964}}
{"_id":3832602,"name":"Villa Valeria","country":"AR","coord":{"lon":-64.920303,"lat":-34.340931}}
{"_id":3832603,"name":"Villa Urquiza","country":"AR","coord":{"lon":-60.374802,"lat":-31.64731}}
{"_id":3832648,"name":"Villa Reduccion","country":"AR","coord":{"lon":-63.862339,"lat":-33.20105}}
{"_id":3832658,"name":"Villa Ojo de Agua","country":"AR","coord":{"lon":-63.693771,"lat":-29.500031}}
{"_id":3832705,"name":"Villa Las Rosas","country":"AR","coord":{"lon":-65.053543,"lat":-31.950211}}
{"_id":3832733,"name":"Villa General Mitre","country":"AR","coord":{"lon":-62.652481,"lat":-29.143101}}
{"_id":3832769,"name":"Villa del Dique","country":"AR","coord":{"lon":-64.455429,"lat":-32.17667}}
{"_id":3832773,"name":"Villa Cura Brochero","country":"AR","coord":{"lon":-65.01796,"lat":-31.70578}}
{"_id":3832779,"name":"Villa Concepcion del Tio","country":"AR","coord":{"lon":-62.813541,"lat":-31.32259}}
{"_id":3832795,"name":"Villa Bustos","country":"AR","coord":{"lon":-67.022491,"lat":-29.28356}}
{"_id":3832917,"name":"Vicuna Mackenna","country":"AR","coord":{"lon":-64.392151,"lat":-33.919651}}
{"_id":3832957,"name":"Viamonte","country":"AR","coord":{"lon":-63.097641,"lat":-33.746471}}
{"_id":3833283,"name":"Valcheta","country":"AR","coord":{"lon":-66.150002,"lat":-40.700001}}
{"_id":3833391,"name":"Uriburu","country":"AR","coord":{"lon":-63.862259,"lat":-36.506821}}
{"_id":3833424,"name":"Union","country":"AR","coord":{"lon":-65.946022,"lat":-35.152821}}
{"_id":3834251,"name":"Toledo","country":"AR","coord":{"lon":-64.009468,"lat":-31.55574}}
{"_id":3834352,"name":"Tintina","country":"AR","coord":{"lon":-62.716671,"lat":-27.033331}}
{"_id":3834361,"name":"Tinogasta","country":"AR","coord":{"lon":-67.56488,"lat":-28.06319}}
{"_id":3834402,"name":"Departamento de Tilcara","country":"AR","coord":{"lon":-65.333328,"lat":-23.5}}
{"_id":3834542,"name":"Telen","country":"AR","coord":{"lon":-65.510178,"lat":-36.26429}}
{"_id":3834961,"name":"Suncho Corral","country":"AR","coord":{"lon":-63.429379,"lat":-27.933571}}
{"_id":3834985,"name":"Sumampa","country":"AR","coord":{"lon":-63.469059,"lat":-29.384701}}
{"_id":3835304,"name":"Sierra Colorada","country":"AR","coord":{"lon":-67.756737,"lat":-40.584869}}
{"_id":3835348,"name":"Serrezuela","country":"AR","coord":{"lon":-65.386917,"lat":-30.637609}}
{"_id":3835582,"name":"Sebastian Elcano","country":"AR","coord":{"lon":-63.593601,"lat":-30.161051}}
{"_id":3835691,"name":"Saturnino M. Laspiur","country":"AR","coord":{"lon":-62.482021,"lat":-31.702869}}
{"_id":3835937,"name":"Santa Rosa de Tastil","country":"AR","coord":{"lon":-65.974518,"lat":-24.45166}}
{"_id":3835941,"name":"Santa Rosa del Conlara","country":"AR","coord":{"lon":-65.203232,"lat":-32.342861}}
{"_id":3836238,"name":"Santa Isabel","country":"AR","coord":{"lon":-66.942398,"lat":-36.227242}}
{"_id":3836284,"name":"Santa Eufemia","country":"AR","coord":{"lon":-63.28281,"lat":-33.176579}}
{"_id":3836407,"name":"Santa Clara","country":"AR","coord":{"lon":-64.662529,"lat":-24.30921}}
{"_id":3854499,"name":"Departamento de GuasayÃ¡n","country":"AR","coord":{"lon":-64.833328,"lat":-28}}
{"_id":3836769,"name":"San Pedro","country":"AR","coord":{"lon":-65.166496,"lat":-27.953859}}
{"_id":3836985,"name":"Departamento de San MartÃ­n","country":"AR","coord":{"lon":-68.25,"lat":-31.5}}
{"_id":3836993,"name":"San Martin","country":"AR","coord":{"lon":-68.35273,"lat":-31.515989}}
{"_id":3837239,"name":"San Jose de la Dormida","country":"AR","coord":{"lon":-63.948719,"lat":-30.354401}}
{"_id":3837625,"name":"San Francisco del Chanar","country":"AR","coord":{"lon":-63.93861,"lat":-29.789909}}
{"_id":3837821,"name":"Departamento de San CristÃ³bal","country":"AR","coord":{"lon":-61.333328,"lat":-30.33333}}
{"_id":3844209,"name":"Departamento de Minas","country":"AR","coord":{"lon":-65.333328,"lat":-31}}
{"_id":3837893,"name":"San Carlos","country":"AR","coord":{"lon":-65.102448,"lat":-31.17761}}
{"_id":3837943,"name":"San Bernardo","country":"AR","coord":{"lon":-60.712521,"lat":-27.287821}}
{"_id":3837985,"name":"San Antonio de los Cobres","country":"AR","coord":{"lon":-66.318771,"lat":-24.21804}}
{"_id":3842418,"name":"Departamento de PaclÃ­n","country":"AR","coord":{"lon":-65.666672,"lat":-28.08333}}
{"_id":3838057,"name":"San Antonio","country":"AR","coord":{"lon":-65.712181,"lat":-28.00927}}
{"_id":3838158,"name":"San Agustin de Valle Fertil","country":"AR","coord":{"lon":-67.468208,"lat":-30.63353}}
{"_id":3838174,"name":"San Agustin","country":"AR","coord":{"lon":-64.374001,"lat":-31.97681}}
{"_id":3838194,"name":"Samuhu","country":"AR","coord":{"lon":-60.39167,"lat":-27.52116}}
{"_id":3838235,"name":"Salsipuedes","country":"AR","coord":{"lon":-64.295891,"lat":-31.137239}}
{"_id":3838237,"name":"Salsacate","country":"AR","coord":{"lon":-65.085289,"lat":-31.31649}}
{"_id":3838460,"name":"Sacanta","country":"AR","coord":{"lon":-63.045052,"lat":-31.663}}
{"_id":3838826,"name":"Rio Pico","country":"AR","coord":{"lon":-71.368469,"lat":-44.179039}}
{"_id":3839381,"name":"Rancul","country":"AR","coord":{"lon":-64.681068,"lat":-35.068619}}
{"_id":3839482,"name":"Rada Tilly","country":"AR","coord":{"lon":-67.533333,"lat":-45.933331}}
{"_id":3840159,"name":"Puerta de Corral Quemado","country":"AR","coord":{"lon":-66.936348,"lat":-27.23}}
{"_id":3840432,"name":"Pozo del Tigre","country":"AR","coord":{"lon":-60.323589,"lat":-24.89682}}
{"_id":3840470,"name":"Pozo del Molle","country":"AR","coord":{"lon":-62.919842,"lat":-32.0186}}
{"_id":3840808,"name":"Departamento de PomÃ¡n","country":"AR","coord":{"lon":-66.416672,"lat":-28.25}}
{"_id":3840809,"name":"Poman","country":"AR","coord":{"lon":-66.22052,"lat":-28.39455}}
{"_id":3841035,"name":"Piquillin","country":"AR","coord":{"lon":-63.757881,"lat":-31.30158}}
{"_id":3841143,"name":"Pilcaniyeu","country":"AR","coord":{"lon":-70.729141,"lat":-41.118809}}
{"_id":3841149,"name":"Pilar","country":"AR","coord":{"lon":-63.879639,"lat":-31.6789}}
{"_id":3841232,"name":"Piedra del Aguila","country":"AR","coord":{"lon":-70.074097,"lat":-40.048111}}
{"_id":3841912,"name":"Pascanas","country":"AR","coord":{"lon":-63.04084,"lat":-33.1255}}
{"_id":3842140,"name":"Pampa de los Guanacos","country":"AR","coord":{"lon":-61.849998,"lat":-26.23333}}
{"_id":3842142,"name":"Pampa del Infierno","country":"AR","coord":{"lon":-61.174358,"lat":-26.505171}}
{"_id":3842268,"name":"Palma Sola","country":"AR","coord":{"lon":-64.298721,"lat":-23.96336}}
{"_id":3842593,"name":"Ordonez","country":"AR","coord":{"lon":-62.86552,"lat":-32.840569}}
{"_id":3842662,"name":"Oliva","country":"AR","coord":{"lon":-63.569778,"lat":-32.04158}}
{"_id":3842876,"name":"Departamento de Nueve de Julio","country":"AR","coord":{"lon":-68.416672,"lat":-31.66667}}
{"_id":3842882,"name":"Nueve de Julio","country":"AR","coord":{"lon":-68.390228,"lat":-31.66914}}
{"_id":3843407,"name":"Naschel","country":"AR","coord":{"lon":-65.375351,"lat":-32.916561}}
{"_id":3843647,"name":"Morrison","country":"AR","coord":{"lon":-62.834549,"lat":-32.594799}}
{"_id":3860201,"name":"Partido de Coronel Rosales","country":"AR","coord":{"lon":-61.833328,"lat":-38.833328}}
{"_id":3843843,"name":"Monte Hermoso","country":"AR","coord":{"lon":-61.29472,"lat":-38.982498}}
{"_id":3844159,"name":"Miramar","country":"AR","coord":{"lon":-62.678139,"lat":-30.918579}}
{"_id":3844377,"name":"Merlo","country":"AR","coord":{"lon":-65.013962,"lat":-32.34288}}
{"_id":3844832,"name":"Mariano Moreno","country":"AR","coord":{"lon":-70.023666,"lat":-38.75029}}
{"_id":3845073,"name":"Malvinas Argentinas","country":"AR","coord":{"lon":-64.066673,"lat":-31.383329}}
{"_id":3845254,"name":"Maimara","country":"AR","coord":{"lon":-65.407967,"lat":-23.62392}}
{"_id":3845398,"name":"Lujan","country":"AR","coord":{"lon":-65.929604,"lat":-32.375702}}
{"_id":3845549,"name":"Los Telares","country":"AR","coord":{"lon":-63.448891,"lat":-28.984791}}
{"_id":3845977,"name":"Los Menucos","country":"AR","coord":{"lon":-68.087181,"lat":-40.844021}}
{"_id":3846175,"name":"Los Frentones","country":"AR","coord":{"lon":-61.413681,"lat":-26.4077}}
{"_id":3846514,"name":"Los Altos","country":"AR","coord":{"lon":-65.499458,"lat":-28.04845}}
{"_id":3846610,"name":"Lonquimay","country":"AR","coord":{"lon":-63.62429,"lat":-36.465462}}
{"_id":3846616,"name":"Londres","country":"AR","coord":{"lon":-67.133492,"lat":-27.71439}}
{"_id":3846632,"name":"Departamento de LoncopuÃ©","country":"AR","coord":{"lon":-70.333328,"lat":-38.083328}}
{"_id":3846634,"name":"Loncopue","country":"AR","coord":{"lon":-70.616089,"lat":-38.072842}}
{"_id":3847482,"name":"La Toma","country":"AR","coord":{"lon":-65.623848,"lat":-33.052582}}
{"_id":3847516,"name":"La Tigra","country":"AR","coord":{"lon":-60.587189,"lat":-27.109961}}
{"_id":3847836,"name":"Las Rosas","country":"AR","coord":{"lon":-61.58041,"lat":-32.476608}}
{"_id":3847933,"name":"Las Parejas","country":"AR","coord":{"lon":-61.516369,"lat":-32.68478}}
{"_id":3847971,"name":"Las Ovejas","country":"AR","coord":{"lon":-70.749908,"lat":-36.988811}}
{"_id":3848209,"name":"Las Lajitas","country":"AR","coord":{"lon":-64.25,"lat":-24.683331}}
{"_id":3848216,"name":"Las Lajas","country":"AR","coord":{"lon":-70.367439,"lat":-38.52322}}
{"_id":3848242,"name":"Las Junturas","country":"AR","coord":{"lon":-63.450161,"lat":-31.831249}}
{"_id":3849196,"name":"La Puerta de San Jose","country":"AR","coord":{"lon":-67.01667,"lat":-27.549999}}
{"_id":3849388,"name":"La Playosa","country":"AR","coord":{"lon":-63.03088,"lat":-32.100021}}
{"_id":3849557,"name":"La Para","country":"AR","coord":{"lon":-63.001068,"lat":-30.894159}}
{"_id":3850888,"name":"Laguna Yema","country":"AR","coord":{"lon":-61.244659,"lat":-24.25391}}
{"_id":3851072,"name":"La Granja","country":"AR","coord":{"lon":-64.268692,"lat":-31.00919}}
{"_id":3851798,"name":"La Cumbre","country":"AR","coord":{"lon":-64.491386,"lat":-30.98201}}
{"_id":3851985,"name":"La Cocha","country":"AR","coord":{"lon":-65.570351,"lat":-27.77729}}
{"_id":3851993,"name":"La Clotilde","country":"AR","coord":{"lon":-60.666672,"lat":-27.133329}}
{"_id":3853479,"name":"Jose de San Martin","country":"AR","coord":{"lon":-70.469673,"lat":-44.05032}}
{"_id":3853767,"name":"Ingenio La Esperanza","country":"AR","coord":{"lon":-64.838959,"lat":-24.22554}}
{"_id":3853782,"name":"Ingeniero Luis A. Huergo","country":"AR","coord":{"lon":-67.23333,"lat":-39.083328}}
{"_id":3853788,"name":"Ingeniero Guillermo N. Juarez","country":"AR","coord":{"lon":-61.849998,"lat":-23.9}}
{"_id":3853935,"name":"Icano","country":"AR","coord":{"lon":-65.328171,"lat":-28.91934}}
{"_id":3853966,"name":"Departamento de Humahuaca","country":"AR","coord":{"lon":-65.333328,"lat":-23.08333}}
{"_id":3853967,"name":"Humahuaca","country":"AR","coord":{"lon":-65.350479,"lat":-23.205441}}
{"_id":3853981,"name":"Huillapima","country":"AR","coord":{"lon":-65.978699,"lat":-28.72533}}
{"_id":3854093,"name":"Huanchillas","country":"AR","coord":{"lon":-63.637009,"lat":-33.666519}}
{"_id":3854102,"name":"Hualfin","country":"AR","coord":{"lon":-66.831306,"lat":-27.22896}}
{"_id":3854153,"name":"Hoyo de Epuyen","country":"AR","coord":{"lon":-71.50811,"lat":-42.071892}}
{"_id":3854318,"name":"Hersilia","country":"AR","coord":{"lon":-61.840801,"lat":-30.004471}}
{"_id":3854336,"name":"Hermoso Campo","country":"AR","coord":{"lon":-61.34441,"lat":-27.60816}}
{"_id":3854988,"name":"Gobernador Costa","country":"AR","coord":{"lon":-70.597977,"lat":-44.049919}}
{"_id":3855092,"name":"General Manuel J. Campos","country":"AR","coord":{"lon":-63.585369,"lat":-37.460251}}
{"_id":3855115,"name":"General Enrique Mosconi","country":"AR","coord":{"lon":-62.299999,"lat":-23.216669}}
{"_id":3855117,"name":"General Enrique Godoy","country":"AR","coord":{"lon":-67.150002,"lat":-39.083328}}
{"_id":3855121,"name":"General Conesa","country":"AR","coord":{"lon":-64.433327,"lat":-40.099998}}
{"_id":3855237,"name":"Gancedo","country":"AR","coord":{"lon":-61.675709,"lat":-27.490379}}
{"_id":3855370,"name":"Fray Luis A. Beltran","country":"AR","coord":{"lon":-60.728191,"lat":-32.791222}}
{"_id":3855588,"name":"Fiambala","country":"AR","coord":{"lon":-67.614899,"lat":-27.68705}}
{"_id":3855763,"name":"Estanislao del Campo","country":"AR","coord":{"lon":-60.092178,"lat":-25.05504}}
{"_id":3856236,"name":"Embajador Martini","country":"AR","coord":{"lon":-64.280922,"lat":-35.38633}}
{"_id":3856496,"name":"El Tio","country":"AR","coord":{"lon":-62.82938,"lat":-31.38357}}
{"_id":3856776,"name":"El Rodeo","country":"AR","coord":{"lon":-65.874199,"lat":-28.215179}}
{"_id":3857879,"name":"El Huecu","country":"AR","coord":{"lon":-70.580063,"lat":-37.645222}}
{"_id":3857974,"name":"El Galpon","country":"AR","coord":{"lon":-64.652588,"lat":-25.38069}}
{"_id":3858088,"name":"Elena","country":"AR","coord":{"lon":-64.394814,"lat":-32.572048}}
{"_id":3858553,"name":"El Carril","country":"AR","coord":{"lon":-65.491737,"lat":-25.0741}}
{"_id":3859000,"name":"El Aguilar","country":"AR","coord":{"lon":-65.692131,"lat":-23.225821}}
{"_id":3859296,"name":"Doblas","country":"AR","coord":{"lon":-64.011833,"lat":-37.14967}}
{"_id":3859521,"name":"Darwin","country":"AR","coord":{"lon":-65.76667,"lat":-39.200001}}
{"_id":3859974,"name":"Corzuela","country":"AR","coord":{"lon":-60.96928,"lat":-26.953739}}
{"_id":3860079,"name":"Corralito","country":"AR","coord":{"lon":-64.192162,"lat":-32.02462}}
{"_id":3860178,"name":"Coronel Moldes","country":"AR","coord":{"lon":-64.597107,"lat":-33.6227}}
{"_id":3860206,"name":"Coronel Belisle","country":"AR","coord":{"lon":-65.98333,"lat":-39.183331}}
{"_id":3860475,"name":"Comallo","country":"AR","coord":{"lon":-70.267838,"lat":-41.02993}}
{"_id":3860730,"name":"Colonia San Bartolome","country":"AR","coord":{"lon":-62.724361,"lat":-31.5278}}
{"_id":3860791,"name":"Colonia Dora","country":"AR","coord":{"lon":-62.950001,"lat":-28.6}}
{"_id":3861262,"name":"Chos Malal","country":"AR","coord":{"lon":-70.270851,"lat":-37.37809}}
{"_id":3861297,"name":"Chorotis","country":"AR","coord":{"lon":-61.399818,"lat":-27.915779}}
{"_id":3861405,"name":"Chimpay","country":"AR","coord":{"lon":-66.142357,"lat":-39.164822}}
{"_id":3862293,"name":"Castro Barros","country":"AR","coord":{"lon":-65.726959,"lat":-30.579519}}
{"_id":3862515,"name":"Carrilobo","country":"AR","coord":{"lon":-63.117161,"lat":-31.872959}}
{"_id":3862771,"name":"Departamento de CapayÃ¡n","country":"AR","coord":{"lon":-66,"lat":-28.83333}}
{"_id":3862772,"name":"Capayan","country":"AR","coord":{"lon":-66.05024,"lat":-28.761049}}
{"_id":3862832,"name":"Candelaria","country":"AR","coord":{"lon":-65.824768,"lat":-32.06036}}
{"_id":3862971,"name":"Canada de Luque","country":"AR","coord":{"lon":-63.723759,"lat":-30.73341}}
{"_id":3863095,"name":"Campo Largo","country":"AR","coord":{"lon":-60.842152,"lat":-26.80077}}
{"_id":3863136,"name":"Campo Gallo","country":"AR","coord":{"lon":-62.849998,"lat":-26.58333}}
{"_id":3863327,"name":"Camarones","country":"AR","coord":{"lon":-65.709938,"lat":-44.797089}}
{"_id":3863366,"name":"Calilegua","country":"AR","coord":{"lon":-64.77002,"lat":-23.77368}}
{"_id":3863491,"name":"Caimancito","country":"AR","coord":{"lon":-64.593697,"lat":-23.7407}}
{"_id":3863554,"name":"Departamento de CachÃ­","country":"AR","coord":{"lon":-66.185417,"lat":-25.09741}}
{"_id":3863557,"name":"Cachi","country":"AR","coord":{"lon":-66.165192,"lat":-25.120331}}
{"_id":3863663,"name":"Buta Ranquil","country":"AR","coord":{"lon":-69.877129,"lat":-37.052219}}
{"_id":3863700,"name":"Departamento de BurruyacÃº","country":"AR","coord":{"lon":-64.916672,"lat":-26.5}}
{"_id":3863701,"name":"Burruyacu","country":"AR","coord":{"lon":-64.742058,"lat":-26.49918}}
{"_id":3863814,"name":"Buena Esperanza","country":"AR","coord":{"lon":-65.253799,"lat":-34.75647}}
{"_id":3863821,"name":"Buchardo","country":"AR","coord":{"lon":-63.509201,"lat":-34.72263}}
{"_id":3864283,"name":"Bernasconi","country":"AR","coord":{"lon":-63.742401,"lat":-37.904591}}
{"_id":3864729,"name":"Barrancas","country":"AR","coord":{"lon":-69.916672,"lat":-36.816669}}
{"_id":3865186,"name":"Avia Terai","country":"AR","coord":{"lon":-60.729198,"lat":-26.68532}}
{"_id":3865578,"name":"Departamento de Arauco","country":"AR","coord":{"lon":-66.833328,"lat":-28.5}}
{"_id":3865579,"name":"Arauco","country":"AR","coord":{"lon":-66.79438,"lat":-28.5805}}
{"_id":3865580,"name":"Arata","country":"AR","coord":{"lon":-64.356209,"lat":-35.63895}}
{"_id":3865585,"name":"Aranguren","country":"AR","coord":{"lon":-60.161072,"lat":-32.242519}}
{"_id":3865605,"name":"Apolinario Saravia","country":"AR","coord":{"lon":-63.99535,"lat":-24.43276}}
{"_id":3865801,"name":"Departamento de AndalgalÃ¡","country":"AR","coord":{"lon":-66.466667,"lat":-27.58333}}
{"_id":3865802,"name":"Andalgala","country":"AR","coord":{"lon":-66.31646,"lat":-27.581949}}
{"_id":3865803,"name":"Andacollo","country":"AR","coord":{"lon":-70.669121,"lat":-37.179451}}
{"_id":3865829,"name":"Departamento de Ancasti","country":"AR","coord":{"lon":-65.5,"lat":-29}}
{"_id":3865830,"name":"Ancasti","country":"AR","coord":{"lon":-65.50145,"lat":-28.812469}}
{"_id":3866028,"name":"Altos de Chipion","country":"AR","coord":{"lon":-62.337269,"lat":-30.9559}}
{"_id":3866161,"name":"Alta Italia","country":"AR","coord":{"lon":-64.11496,"lat":-35.3335}}
{"_id":3866353,"name":"Alejo Ledesma","country":"AR","coord":{"lon":-62.623039,"lat":-33.60643}}
{"_id":3867009,"name":"Abra Pampa","country":"AR","coord":{"lon":-65.696968,"lat":-22.72049}}
{"_id":6942842,"name":"Bella Italia","country":"AR","coord":{"lon":-61.423962,"lat":-31.27268}}
{"_id":7116865,"name":"Carilo","country":"AR","coord":{"lon":-56.891331,"lat":-37.165241}}
{"_id":7284819,"name":"La Punta","country":"AR","coord":{"lon":-66.312698,"lat":-33.183681}}
{"_id":7304381,"name":"Villa Berna","country":"AR","coord":{"lon":-64.756508,"lat":-31.90321}}
{"_id":7304383,"name":"Cuesta Blanca","country":"AR","coord":{"lon":-64.571503,"lat":-31.48658}}
{"_id":8015350,"name":"Santa Catalina - Dique Lujan","country":"AR","coord":{"lon":-58.70673,"lat":-34.383751}}
*/

    public static Uri getStringUrlBsAs(){
        Uri uriBuilt= Uri.parse(WEATHER_REQUEST).buildUpon()
                .appendQueryParameter("id",BSAS_ID)
                .appendQueryParameter("mode","json")
                .appendQueryParameter("cnt", Integer.toString(FORECAST_DAYS))
                .appendQueryParameter(API_CMD,API_KEY)
                .build();
        return uriBuilt;
    }
}
