import { useState } from 'react'
import './App.css'
import Form from './Components/Form/Form'
import Table from './Components/Table/Table'

function App() {
  const [btnCadastrar, setBtnCadastrar] = useState(true);
  

  return (
    <>
      <Form btn={btnCadastrar}/>
      <Table />
    </>
  )
}

export default App
