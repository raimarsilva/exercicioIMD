// Definição de um componente no React.
function Processo({numero, orgaoJudic, relator}){
    

    return (
        <div>
            <p>Número do Processo: {numero}</p>
            <p>Órgão judicante: {orgaoJudic}</p>
            <p>Relator: {relator}</p>
        </div>
    );
}
export default Processo;