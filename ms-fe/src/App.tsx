import React from 'react';
import {Card, Flex} from "antd";
import {UserTable} from "./tables/UserTable";
import {CarTable} from "./tables/CarTable";

export function App() {
    return <>
        <Flex vertical align="center" style={{height: '100vh', padding: '0 100px', backgroundColor: '#c1ded4'}}>
            <Card title="Users" size="default" style={{width: '100%', margin: '50px  100px'}} hoverable>
                <UserTable/>
            </Card>
            <Card title="Cars" size="default" style={{width: '100%', margin: '0 100px'}} hoverable>
                <CarTable/>
            </Card>
        </Flex>
    </>;
}
