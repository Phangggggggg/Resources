import React, {Component} from "react";
class Counter extends Component{
    state = { //set attribute
        count: 1,
        tagArray: ["tag1","tag2","tag3"] // array in react
    };

    style = { // this is for css
        fontSize: 20,
        fontWeight: "bold",
    };
    render() {
            return( <React.Fragment>
                <span style={this.style} className={this.getBadge()}>
                    {this.formatCount()}
                </span>
                <button className = {"badge badge-secondary  m-2"} style={{fontSize:40}}> Increment</button>
                <ul>
                    {this.state.tagArray.map(tag => <li key={tag}>{tag}</li>)} // map function by bring out string tag maps to list html
                </ul>
            </React.Fragment>

        )
    }


    getBadge() {
        let classes = "badge badge-"; // want to modify need use let instead of const
        classes += (this.state.count == 0) ? "warning m-2" : "primary m-2";
        return classes;
    }


    formatCount() {
        const count = this.state.count;
        return count === 0 ? <h3>Zero </h3> :count;

    }

}

export default Counter;