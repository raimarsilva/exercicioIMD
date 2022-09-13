function Evento () {

    function alertar(e){
        e.preventDefault()
        window.alert("apertado")}
    
    function carregar(){window.alert("carregado")}

    return (
        <div>Este é um elemento de evento.
            <form onSubmit={carregar}>
            <button onClick={alertar}>Clicar</button>
            </form>
            
            
        </div>
    )
}

export default Evento