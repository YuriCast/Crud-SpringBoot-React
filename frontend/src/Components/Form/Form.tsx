import './FormStyles.css'

export default function Form() {
  return (
    <form>
        <div className='input-container'>
          <input type="text" placeholder="Name" className='input' />
          <input type="text" placeholder="Brand" className='input' />
        </div>
        <div className='btn'>
          <input type="button" value="Register" className='register' />
          <input type="button" value="Change" className='change' />
          <input type="button" value="Delete" className='delete' />
          <input type="button" value="Calcel" className='cancel' />
      </div>
    </form>
  )
}
