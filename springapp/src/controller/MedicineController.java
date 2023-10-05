package com.example.controller;
import org.springframework.web.bind.annotation.*;
import com.example.model.Medicine;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/medicines")
public class MedicineController {
    private Map<Integer,Medicine>medicineMap=new HashMap<>();
    @PostMapping
    public boolean addMedicine(@RequestBody Medicine medicine){
        if(medicineMap.containsKey(medicine.getMedicineId())){
            return false;
        }
        medicineMap.put(medicine)
    }
}
