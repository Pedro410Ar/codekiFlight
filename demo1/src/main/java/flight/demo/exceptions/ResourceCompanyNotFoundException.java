package flight.demo.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class ResourceCompanyNotFoundException extends IllegalArgumentException{

    private String resourceName;
    private String fieldName;
    private Long value;


    public ResourceCompanyNotFoundException(String resourceName, String fieldName, Long value) {
        super(String.format("%s not found: %s '%s'", resourceName, fieldName,value));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.value = value;
    } 
    
    

}
