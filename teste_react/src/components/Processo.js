// Definição de um componente no React.
function Processo({idprocesso, numeroProcesso, relator, autor, reu}){
    return (
        <div>
            <h2>Número do Processo: {numeroProcesso}</h2>
            <h3>Relator: {relator}</h3>
            <h3>Autor: {autor}</h3>
            <h3>Réu: {reu}</h3>
        </div>
    )
}

export default Processo