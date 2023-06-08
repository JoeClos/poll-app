import { useState, useEffect } from "react";
import AOS from "aos";
import "aos/dist/aos.css";
import axios from "axios";
import { api } from "../constants/api";
import Radio from "@mui/material/Radio";
import RadioGroup from "@mui/material/RadioGroup";
import FormControlLabel from "@mui/material/FormControlLabel";
import FormControl from "@mui/material/FormControl";
import Card from "@mui/material/Card";
import CardHeader from "@mui/material/CardHeader";
import CardContent from "@mui/material/CardContent";
import Avatar from "@mui/material/Avatar";
import { green } from "@mui/material/colors";

const PollList = () => {
  const [polls, setPolls] = useState([]);

  const handleChange = (event) => {
    setPolls(event.target.value);
    console.log(event.target.value);
  };


  useEffect(() => {
    const API = api + "/polls";
    AOS.init();
    axios
      .get(API)
      .then((response) => {
        setPolls(response.data);
        console.log(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  return (
    <div>
      <div  style={{color:"#4CAF50", textTransform:"uppercase", textAlign:"center", marginTop:"2rem"}}>
          <h1>Opinion Poll</h1>
      </div>
      <FormControl
        style={{
          display: "flex",
          justifyContent: "center",
          alignItems: "center",
          color:"#E7E7E7"
        }}
      >
        {Object.values(polls).map((p, index) => {
          return (
            <div
              key={index}
              data-aos="flip-left"
              style={{
                margin: "auto",
                padding: "5rem",
                width: "50%",
              }}
            >
              <div>
                <Card
                  elevation={6}
                  sx={{ borderRadius: "16px", padding: "1rem" }}
                >
                  <CardHeader
                    title={p.title}
                    subheader="Choose single option"
                    avatar={
                      <Avatar sx={{ bgcolor: green[500] }}>{p.id}</Avatar>
                    }
                    titleTypographyProps={{
                      fontSize: 15,
                    }}
                    subheaderTypographyProps={{
                      fontSize: 13,
                    }}
                    style={{ fontSize: "1rem" }}
                  />
                  <CardContent>
                    {/* <RadioGroup
                      aria-labelledby="demo-controlled-radio-buttons-group"
                      name="controlled-radio-buttons-group"
                      value={polls}
                      onChange={handleChange}
                    > */}
                    <RadioGroup
                      aria-labelledby="demo-radio-buttons-group-label"
                      //  defaultValue={p.otpion1}
                      name="radio-buttons-group"
                    >
                      <FormControlLabel
                        value={p.option1}
                        control={
                          <Radio
                            color="success"
                            orientation="vertical"
                            variant="outlined"
                            // onChange={handleChange}
                          />
                        }
                        label={p.option1}
                      />
                      <FormControlLabel
                        value={p.option2}
                        control={
                          <Radio
                            color="success"
                            orientation="vertical"
                            variant="outlined"
                          />
                        }
                        label={p.option2}
                      />
                      <FormControlLabel
                        value={p.option3}
                        control={
                          <Radio
                            color="success"
                            orientation="vertical"
                            variant="outlined"
                          />
                        }
                        label={p.option3}
                      />
                      <FormControlLabel
                        value={p.option4}
                        control={
                          <Radio
                            color="success"
                            orientation="vertical"
                            variant="outlined"
                          />
                        }
                        label={p.option4}
                      />
                    </RadioGroup>
                    <p>
                      Selected answer <strong></strong>
                    </p>
                  </CardContent>
                </Card>
              </div>
            </div>
          );
        })}
      </FormControl>
    </div>
  );
};

export default PollList;
