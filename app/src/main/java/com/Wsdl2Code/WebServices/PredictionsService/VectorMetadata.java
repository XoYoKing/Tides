package com.Wsdl2Code.WebServices.PredictionsService;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 10/19/2017 10:20:46 PM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

import java.util.Vector;

import com.Wsdl2Code.WebServices.PredictionsService.Metadata;

public class VectorMetadata extends Vector<Metadata> implements KvmSerializable {


    public VectorMetadata() {
    }

    public VectorMetadata(Vector<SoapObject> vectorOfSoapObjects) {
        if (vectorOfSoapObjects == null)
            return;
        if (vectorOfSoapObjects != null) {
            int size = vectorOfSoapObjects.size();
            for (int i0 = 0; i0 < size; i0++) {
                SoapObject obj = vectorOfSoapObjects.get(i0);
                if (obj != null && obj.getClass().equals(SoapObject.class)) {
                    Metadata j1 = new Metadata(obj);
                    add(j1);
                }
            }
        }
    }

    @Override
    public Object getProperty(int arg0) {
        return this.get(arg0);
    }

    @Override
    public int getPropertyCount() {
        return this.size();
    }

    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        info.name = "Metadata";
        info.type = Metadata.class;
    }

    //    @Override
    public String getInnerText() {
        return null;
    }


    //    @Override
    public void setInnerText(String s) {
    }


    @Override
    public void setProperty(int arg0, Object arg1) {
    }

}
