import './FormStyles.css'

export default function Form({ btn, keyboardEvent, register, obj, cancel }) {
  return (
    <form>
        <div className='input-container'>
          <input type="text" value={obj.name} onChange={keyboardEvent} name='name' placeholder="Name" className='input' />
          <input type="text" value={obj.brand} onChange={keyboardEvent} name='brand' placeholder="Brand" className='input' />
        </div>

        {
          btn
          ?
          <input type="button" value="Register" onClick={register} className='register' />
          :
        <div className='btn'>
          <input type="button" value="Change" className='change' />
          <input type="button" value="Delete" className='delete' />
          <input type="button" value="Calcel" onClick={cancel} className='cancel' />
      </div>
        }

    </form>
  )
}
