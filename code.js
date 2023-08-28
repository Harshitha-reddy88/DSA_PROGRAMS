import React from 'react';
import './bankdetails.css';
import react,{useState} from 'react';
function BankDetails () {
    const [name,setName]=useState('');
    const [address,setAddress]=useState('');
    const [contact,setContact]=useState('');
    const [accountNumber,setAccount]=useState('');
    const [accountType,setAccountType]=useState('');
    const [IFSC,setIFSC]=useState('');

    const getData =() => {
        console.log(name,address,contact,accountNumber,accountType,IFSC);
    }

    return(
        <div>

            <h1>Bank Details</h1>

            <div className='detailsDiv'>

                <div className='firstDiv'>
                    <div className='margintop'>
                       <input  className="inputTag" type="text" placeholder="fullname" onChange={e => setName(e.target.value)}/>
                    </div>

                    <div className='margintop'>
                       <input className="inputTag"  onChange={e => setAddress (e.target.value)} type="text" placeholder="address"/>
                    </div>
                    <div className='margintop'>
                       <input className="inputTag"  onChange={e => setContact (e.target.value)} type="text" placeholder="contact information"/>
                    </div>
                </div>

                <div className='secondDiv'>
                    <div className='margintop'>
                        <input className="inputTag" onChange={e => setAccount (e.target.value)} type="text" placeholder="Account number"/>
                    </div>

                    <div className='margintop'>
                        <input className="inputTag" onChange={e => setAccountType (e.target.value)} type="text" placeholder="account type"/>
                    </div>

                    <div className='margintop'>
                        <input className="inputTag"  onChange={e => setIFSC (e.target.value)} type="text" placeholder="IFSC number"/>
                    </div>
                </div>

            </div>
            <button onClick={()=> getData()}className='submit'>Submit</button>
           
        </div>
    )
}
export default BankDetails ;
